package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.album
import typings.wegameApi.wegameApiStrings.camera
import typings.wegameApi.wegameApiStrings.compressed
import typings.wegameApi.wegameApiStrings.original
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeType extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var count: Double = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 所选的图片的尺寸
    */
  var sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed]) = js.native
  
  /**
    * 选择图片的来源
    */
  var sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera]) = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ TempFilePaths, Unit]] = js.native
}
object SizeType {
  
  @scala.inline
  def apply(
    count: Double,
    sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed]),
    sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera])
  ): SizeType = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sizeType = sizeType.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeType]
  }
  
  @scala.inline
  implicit class SizeTypeMutableBuilder[Self <: SizeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSizeType(value: (js.Array[original | compressed]) | (js.Tuple2[original, compressed])): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeVarargs(value: (original | compressed)*): Self = StObject.set(x, "sizeType", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: (js.Array[album | camera]) | (js.Tuple2[album, camera])): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeVarargs(value: (album | camera)*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ TempFilePaths => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
