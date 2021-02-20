package typings.typeorm

import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import typings.typeorm.typeormStrings.STI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsInheritanceMetadataArgsMod {
  
  @js.native
  trait InheritanceMetadataArgs extends StObject {
    
    /**
      * Column used as inheritance discriminator column.
      */
    val column: js.UndefOr[ColumnOptions] = js.native
    
    /**
      * Inheritance pattern.
      */
    val pattern: STI = js.native
    
    /**
      * Class to which inheritance is applied.
      */
    val target: js.UndefOr[js.Function | String] = js.native
  }
  object InheritanceMetadataArgs {
    
    @scala.inline
    def apply(pattern: STI): InheritanceMetadataArgs = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[InheritanceMetadataArgs]
    }
    
    @scala.inline
    implicit class InheritanceMetadataArgsMutableBuilder[Self <: InheritanceMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnOptions): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setPattern(value: STI): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
