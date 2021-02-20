package typings.webidlConversions

import typings.webidlConversions.mod.Globals
import typings.webidlConversions.webidlConversionsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined webidl-conversions.webidl-conversions.BufferSourceOptions & {  allowShared :false | undefined} */
  @js.native
  trait BufferSourceOptionsallowS extends StObject {
    
    var allowShared: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
    
    var context: js.UndefOr[String] = js.native
    
    var globals: js.UndefOr[Globals] = js.native
  }
  object BufferSourceOptionsallowS {
    
    @scala.inline
    def apply(allowShared: js.UndefOr[Boolean] with js.UndefOr[`false`]): BufferSourceOptionsallowS = {
      val __obj = js.Dynamic.literal(allowShared = allowShared.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferSourceOptionsallowS]
    }
    
    @scala.inline
    implicit class BufferSourceOptionsallowSMutableBuilder[Self <: BufferSourceOptionsallowS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowShared(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "allowShared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setGlobals(value: Globals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    }
  }
}
