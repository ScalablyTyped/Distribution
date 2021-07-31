package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderSelectQueryMod {
  
  trait SelectQuery extends StObject {
    
    var aliasName: js.UndefOr[String] = js.undefined
    
    var selection: String
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object SelectQuery {
    
    @scala.inline
    def apply(selection: String): SelectQuery = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectQuery]
    }
    
    @scala.inline
    implicit class SelectQueryMutableBuilder[Self <: SelectQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasName(value: String): Self = StObject.set(x, "aliasName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasNameUndefined: Self = StObject.set(x, "aliasName", js.undefined)
      
      @scala.inline
      def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
}
