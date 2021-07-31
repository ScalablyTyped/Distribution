package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketReadStreamOptions extends StObject {
  
  /**
    * Optional 0-based offset in bytes to stop streaming before.
    */
  var end: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Optional skip for the file find query.
    */
  var skip: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Optional sort for the file find query.
    */
  var sort: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Optional 0-based offset in bytes to start streaming from.
    */
  var start: js.UndefOr[scala.Double] = js.undefined
}
object GridFSBucketReadStreamOptions {
  
  @scala.inline
  def apply(): GridFSBucketReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketReadStreamOptions]
  }
  
  @scala.inline
  implicit class GridFSBucketReadStreamOptionsMutableBuilder[Self <: GridFSBucketReadStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: scala.Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSort(value: scala.Double): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setStart(value: scala.Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
