package typings.tsconfigPaths.tsconfigLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TsConfigLoaderParams extends js.Object {
  
  var cwd: String = js.native
  
  def getEnv(key: String): js.UndefOr[String] = js.native
  
  var loadSync: js.UndefOr[
    js.Function2[/* cwd */ String, /* filename */ js.UndefOr[String], TsConfigLoaderResult]
  ] = js.native
}
object TsConfigLoaderParams {
  
  @scala.inline
  def apply(cwd: String, getEnv: String => js.UndefOr[String]): TsConfigLoaderParams = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], getEnv = js.Any.fromFunction1(getEnv))
    __obj.asInstanceOf[TsConfigLoaderParams]
  }
  
  @scala.inline
  implicit class TsConfigLoaderParamsOps[Self <: TsConfigLoaderParams] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEnv(value: String => js.UndefOr[String]): Self = this.set("getEnv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadSync(value: (/* cwd */ String, /* filename */ js.UndefOr[String]) => TsConfigLoaderResult): Self = this.set("loadSync", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadSync: Self = this.set("loadSync", js.undefined)
  }
}
