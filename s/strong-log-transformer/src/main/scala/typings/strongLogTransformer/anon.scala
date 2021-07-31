package typings.strongLogTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<strong-log-transformer.strong-log-transformer.Options> */
  trait PartialOptions extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var mergeMultiline: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var timeStamp: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMergeMultiline(value: Boolean): Self = StObject.set(x, "mergeMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeMultilineUndefined: Self = StObject.set(x, "mergeMultiline", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTimeStamp(value: Boolean): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    }
  }
}
