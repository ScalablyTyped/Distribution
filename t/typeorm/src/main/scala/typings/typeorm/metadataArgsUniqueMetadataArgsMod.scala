package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsUniqueMetadataArgsMod {
  
  @js.native
  trait UniqueMetadataArgs extends StObject {
    
    /**
      * Columns combination to be unique.
      */
    var columns: js.UndefOr[
        (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]]) | js.Array[String]
      ] = js.native
    
    /**
      * Unique constraint name.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Class to which index is applied.
      */
    var target: js.Function | String = js.native
  }
  object UniqueMetadataArgs {
    
    @scala.inline
    def apply(target: js.Function | String): UniqueMetadataArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[UniqueMetadataArgs]
    }
    
    @scala.inline
    implicit class UniqueMetadataArgsMutableBuilder[Self <: UniqueMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(
        value: (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]]) | js.Array[String]
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsFunction1(value: /* object */ js.UndefOr[js.Any] => js.Array[_] | StringDictionary[Double]): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
