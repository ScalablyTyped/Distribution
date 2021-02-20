package typings.wnumb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a wNumb
    */
  @JSImport("wnumb", JSImport.Default)
  @js.native
  def default(): Instance = js.native
  @JSImport("wnumb", JSImport.Default)
  @js.native
  def default(options: Options): Instance = js.native
  
  @js.native
  trait Instance extends StObject {
    
    /**
      * get number from formatted string
      */
    def from(`val`: String): Double = js.native
    
    /**
      * format to string
      */
    def to(`val`: Double): String = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(from: String => Double, to: Double => String): Instance = {
      val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction1(to))
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String => Double): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTo(value: Double => String): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** The number of decimals to include in the result. Limited to 7. */
    var decimals: js.UndefOr[Double] = js.native
    
    /**
      * Reverse the operations set in encoder.
      * Use this option to undo modifications made while encoding the value.
      * function( value ){
      *   return value / 1.32;
      * }
      */
    var decoder: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
    
    /**
      * Similar to encoder, but applied after all other formatting options are applied.
      */
    var edit: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
    
    /**
      * This is a powerful option to manually modify the slider output.
      * For example, to show a number in another currency:
      * function( value ){
      *  return value * 1.32;
      * }
      */
    var encoder: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
    
    /**
      * The decimal separator.
      * Defaults to '.' if thousand isn't already set to '.'.
      */
    var mark: js.UndefOr[String] = js.native
    
    /**
      * The prefix for negative values. Defaults to '-' if negativeBefore isn't set.
      */
    var negative: js.UndefOr[String] = js.native
    
    /**
      * The prefix for a negative number. Inserted before prefix.
      */
    var negativeBefore: js.UndefOr[String] = js.native
    
    /**
      * A string to prepend to the number. Use cases include prefixing with money symbols such as '$' or '€'.
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * A number to append to a number. For example: ',-'.
      */
    var suffix: js.UndefOr[String] = js.native
    
    /**
      * Separator for large numbers. For example: ' ' would result in a formatted number of 1 000 000.
      */
    var thousand: js.UndefOr[String] = js.native
    
    /**
      * Similar to decoder and the reverse for edit.
      * Applied before all other formatting options are applied.
      */
    var undo: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
      
      @scala.inline
      def setDecoder(value: /* value */ Double => Double): Self = StObject.set(x, "decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecoderUndefined: Self = StObject.set(x, "decoder", js.undefined)
      
      @scala.inline
      def setEdit(value: /* value */ Double => Double): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      @scala.inline
      def setEncoder(value: /* value */ Double => Double): Self = StObject.set(x, "encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncoderUndefined: Self = StObject.set(x, "encoder", js.undefined)
      
      @scala.inline
      def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeBefore(value: String): Self = StObject.set(x, "negativeBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeBeforeUndefined: Self = StObject.set(x, "negativeBefore", js.undefined)
      
      @scala.inline
      def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
      
      @scala.inline
      def setUndo(value: /* value */ Double => Double): Self = StObject.set(x, "undo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
    }
  }
}
