package typings.typedoc.schemaMod

import typings.typedoc.abstractMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {-readonly [ K2 in never ]: typedoc.typedoc/dist/lib/models.ReferenceReflection[K2] extends typedoc.typedoc/dist/lib/serialization/schema.Primitive? typedoc.typedoc/dist/lib/models.ReferenceReflection[K2] : typedoc.typedoc/dist/lib/serialization/schema.ModelToObject<typedoc.typedoc/dist/lib/models.ReferenceReflection[K2]>} */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait ReferenceReflection extends DeclarationReflection {
  
  var target: Double = js.native
}
object ReferenceReflection {
  
  @scala.inline
  def apply(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String,
    target: Double
  ): ReferenceReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceReflection]
  }
  
  @scala.inline
  implicit class ReferenceReflectionMutableBuilder[Self <: ReferenceReflection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
