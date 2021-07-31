package typings.textTable

import typings.textTable.textTableStrings.Dot
import typings.textTable.textTableStrings.c
import typings.textTable.textTableStrings.l
import typings.textTable.textTableStrings.r
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(
    /** An array of arrays containing strings, numbers, or other printable values. */
  rows: js.Array[js.Array[js.Object]]
  ): String = ^.asInstanceOf[js.Dynamic].apply(rows.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(
    /** An array of arrays containing strings, numbers, or other printable values. */
  rows: js.Array[js.Array[js.Object]],
    /** A configuration object to customize table output. */
  options: Options
  ): String = (^.asInstanceOf[js.Dynamic].apply(rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("text-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /** An array of alignment types for each column, default ['l','l',...]. */
    var align: js.UndefOr[js.Array[js.UndefOr[l | r | c | Dot | Null]]] = js.undefined
    
    /** Separator to use between columns, (default: ' '). */
    var hsep: js.UndefOr[String] = js.undefined
    
    /** A callback function to use when calculating the string length. */
    var stringLength: js.UndefOr[js.Function1[/* str */ String, Double]] = js.undefined
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
      def setAlign(value: js.Array[js.UndefOr[l | r | c | Dot | Null]]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAlignVarargs(value: (js.UndefOr[l | r | c | Dot | Null])*): Self = StObject.set(x, "align", js.Array(value :_*))
      
      @scala.inline
      def setHsep(value: String): Self = StObject.set(x, "hsep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsepUndefined: Self = StObject.set(x, "hsep", js.undefined)
      
      @scala.inline
      def setStringLength(value: /* str */ String => Double): Self = StObject.set(x, "stringLength", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringLengthUndefined: Self = StObject.set(x, "stringLength", js.undefined)
    }
  }
}
