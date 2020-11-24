package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Argv extends js.Object {
  
  var argv: js.Array[java.lang.String] = js.native
  
  var build_info: java.lang.String = js.native
  
  var exit_status: Double = js.native
  
  var platform_info: java.lang.String = js.native
  
  var version: js.Array[Double] = js.native
}
object Argv {
  
  @scala.inline
  def apply(
    argv: js.Array[java.lang.String],
    build_info: java.lang.String,
    exit_status: Double,
    platform_info: java.lang.String,
    version: js.Array[Double]
  ): Argv = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], build_info = build_info.asInstanceOf[js.Any], exit_status = exit_status.asInstanceOf[js.Any], platform_info = platform_info.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argv]
  }
  
  @scala.inline
  implicit class ArgvOps[Self <: Argv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgvVarargs(value: java.lang.String*): Self = this.set("argv", js.Array(value :_*))
    
    @scala.inline
    def setArgv(value: js.Array[java.lang.String]): Self = this.set("argv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild_info(value: java.lang.String): Self = this.set("build_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit_status(value: Double): Self = this.set("exit_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform_info(value: java.lang.String): Self = this.set("platform_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionVarargs(value: Double*): Self = this.set("version", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: js.Array[Double]): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
