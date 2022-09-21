package typings.yamlAstParser

import typings.yamlAstParser.typeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @JSImport("yaml-ast-parser/dist/src/schema", "Schema")
  @js.native
  open class Schema protected () extends StObject {
    def this(definition: SchemaDefinition) = this()
    
    var compiledExplicit: js.Array[Any] = js.native
    
    var compiledImplicit: js.Array[Any] = js.native
    
    var compiledTypeMap: js.Array[Any] = js.native
    
    var explicit: js.Array[Type] = js.native
    
    var `implicit`: js.Array[Type] = js.native
    
    var include: js.Array[Schema] = js.native
  }
  /* static members */
  object Schema {
    
    @JSImport("yaml-ast-parser/dist/src/schema", "Schema")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml-ast-parser/dist/src/schema", "Schema.DEFAULT")
    @js.native
    def DEFAULT: Any = js.native
    inline def DEFAULT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    inline def create(): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Schema]
  }
  
  trait SchemaDefinition extends StObject {
    
    var explicit: js.UndefOr[js.Array[Type]] = js.undefined
    
    var `implicit`: js.UndefOr[js.Array[Type]] = js.undefined
    
    var include: js.UndefOr[js.Array[Schema]] = js.undefined
  }
  object SchemaDefinition {
    
    inline def apply(): SchemaDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaDefinition]
    }
    
    extension [Self <: SchemaDefinition](x: Self) {
      
      inline def setExplicit(value: js.Array[Type]): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setExplicitUndefined: Self = StObject.set(x, "explicit", js.undefined)
      
      inline def setExplicitVarargs(value: Type*): Self = StObject.set(x, "explicit", js.Array(value*))
      
      inline def setImplicit(value: js.Array[Type]): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
      
      inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
      
      inline def setImplicitVarargs(value: Type*): Self = StObject.set(x, "implicit", js.Array(value*))
      
      inline def setInclude(value: js.Array[Schema]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: Schema*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
}
