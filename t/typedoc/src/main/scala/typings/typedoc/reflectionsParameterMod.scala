package typings.typedoc

import typings.typedoc.abstractMod.DefaultValueContainer
import typings.typedoc.abstractMod.Reflection
import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.reflectionsSignatureMod.SignatureReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsParameterMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedoc.abstractMod.Reflection because Already inherited
  - typings.typedoc.abstractMod.TypeContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined `type` */ @JSImport("typedoc/dist/lib/models/reflections/parameter", "ParameterReflection")
  @js.native
  class ParameterReflection protected () extends DefaultValueContainer {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: Reflection) = this()
    
    @JSName("parent")
    var parent_ParameterReflection: js.UndefOr[SignatureReflection] = js.native
    
    var `type`: js.UndefOr[Type] = js.native
  }
}
