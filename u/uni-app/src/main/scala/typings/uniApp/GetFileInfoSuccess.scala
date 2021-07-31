package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileInfoSuccess extends StObject {
  
  /**
    * 按照传入的 digestAlgorithm 计算得出的的文件摘要
    */
  var digest: js.UndefOr[String] = js.undefined
  
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  
  /**
    * 文件大小，单位：B
    */
  var size: js.UndefOr[Double] = js.undefined
}
object GetFileInfoSuccess {
  
  @scala.inline
  def apply(): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
  
  @scala.inline
  implicit class GetFileInfoSuccessMutableBuilder[Self <: GetFileInfoSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
