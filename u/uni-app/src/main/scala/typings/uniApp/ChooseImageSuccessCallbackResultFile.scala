package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseImageSuccessCallbackResultFile extends StObject {
  
  /**
    * 本地文件路径
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * 本地文件大小，单位：B
    */
  var size: js.UndefOr[Double] = js.native
}
object ChooseImageSuccessCallbackResultFile {
  
  @scala.inline
  def apply(): ChooseImageSuccessCallbackResultFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageSuccessCallbackResultFile]
  }
  
  @scala.inline
  implicit class ChooseImageSuccessCallbackResultFileMutableBuilder[Self <: ChooseImageSuccessCallbackResultFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
