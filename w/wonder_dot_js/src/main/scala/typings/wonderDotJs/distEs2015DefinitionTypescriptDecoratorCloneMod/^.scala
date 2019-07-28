package typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cloneAttributeAsBasicType(): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def cloneAttributeAsBasicType(configData: CloneAttributeAsBasicTypeConfigData): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def cloneAttributeAsCloneable(): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def cloneAttributeAsCloneable(configData: CloneAttributeAsCloneableConfigData): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ String, 
      /* cloneData */ js.Any, 
      Unit
    ]
  ): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ String, 
      /* cloneData */ js.Any, 
      Unit
    ],
    configData: CloneAttributeAsCustomTypeConfigData
  ): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
}

