package typings.w3cXmlserializer

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("w3c-xmlserializer", JSImport.Namespace)
  @js.native
  def apply(root: Node): String = js.native
  @JSImport("w3c-xmlserializer", JSImport.Namespace)
  @js.native
  def apply(root: Node, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Whether the serialization algorithm will throw an `Error`
      * when the `Node` can't be serialized to well-formed XML.
      *
      * @default false
      */
    var requireWellFormed: js.UndefOr[Boolean] = js.native
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
      def setRequireWellFormed(value: Boolean): Self = StObject.set(x, "requireWellFormed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireWellFormedUndefined: Self = StObject.set(x, "requireWellFormed", js.undefined)
    }
  }
}
