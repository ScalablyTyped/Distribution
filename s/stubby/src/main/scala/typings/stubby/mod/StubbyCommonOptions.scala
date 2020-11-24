package typings.stubby.mod

import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StubbyCommonOptions extends js.Object {
  
  /** additional options to pass to the underlying tls server */
  var _httpsOptions: js.UndefOr[TlsOptions] = js.native
  
  /** port number to run the admin portal */
  var admin: js.UndefOr[Double] = js.native
  
  /** JavaScript Object/Array containing endpoint data */
  var data: js.UndefOr[StubbyData | js.Array[StubbyData]] = js.native
  
  var datadir: js.UndefOr[String] = js.native
  
  /** address/hostname at which to run stubby */
  var location: js.UndefOr[String] = js.native
  
  /** defaults to `true`. Pass in `false` to have console output (if available) */
  var quiet: js.UndefOr[Boolean] = js.native
  
  /** port number to run the stubs portal */
  var stubs: js.UndefOr[Double] = js.native
  
  /** port number to run the stubs portal over https */
  var tls: js.UndefOr[Double] = js.native
  
  /** filename to monitor and load as stubby's data when changes occur */
  var watch: js.UndefOr[String] = js.native
}
object StubbyCommonOptions {
  
  @scala.inline
  def apply(): StubbyCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StubbyCommonOptions]
  }
  
  @scala.inline
  implicit class StubbyCommonOptionsOps[Self <: StubbyCommonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_httpsOptions(value: TlsOptions): Self = this.set("_httpsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_httpsOptions: Self = this.set("_httpsOptions", js.undefined)
    
    @scala.inline
    def setAdmin(value: Double): Self = this.set("admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdmin: Self = this.set("admin", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: StubbyData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: StubbyData | js.Array[StubbyData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDatadir(value: String): Self = this.set("datadir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatadir: Self = this.set("datadir", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    
    @scala.inline
    def setStubs(value: Double): Self = this.set("stubs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStubs: Self = this.set("stubs", js.undefined)
    
    @scala.inline
    def setTls(value: Double): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    
    @scala.inline
    def setWatch(value: String): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
