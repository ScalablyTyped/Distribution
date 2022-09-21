package typings.typedoc.schemaMod

import typings.typedoc.kindMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {-readonly [ K2 in never ]: typedoc.typedoc/dist/lib/serialization/schema.ToSerialized<typedoc.typedoc/dist/lib/models.ReferenceReflection[K2]>} */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait ReferenceReflection
  extends StObject
     with DeclarationReflection {
  
  /**
    * -1 if the reference refers to a symbol that does not exist in the documentation.
    * Otherwise, the reflection ID.
    */
  var target: Double
}
object ReferenceReflection {
  
  inline def apply(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String],
    target: Double
  ): ReferenceReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceReflection]
  }
  
  extension [Self <: ReferenceReflection](x: Self) {
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
