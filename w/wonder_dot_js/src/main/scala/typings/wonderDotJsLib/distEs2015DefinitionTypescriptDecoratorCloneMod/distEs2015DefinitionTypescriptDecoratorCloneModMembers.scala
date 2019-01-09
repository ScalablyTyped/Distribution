package typings
package wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", JSImport.Namespace)
@js.native
object distEs2015DefinitionTypescriptDecoratorCloneModMembers extends js.Object {
  def cloneAttributeAsBasicType(): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def cloneAttributeAsBasicType(configData: CloneAttributeAsBasicTypeConfigData): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def cloneAttributeAsCloneable(): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def cloneAttributeAsCloneable(configData: CloneAttributeAsCloneableConfigData): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ java.lang.String, 
      /* cloneData */ js.Any, 
      scala.Unit
    ]
  ): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def cloneAttributeAsCustomType(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ java.lang.String, 
      /* cloneData */ js.Any, 
      scala.Unit
    ],
    configData: CloneAttributeAsCustomTypeConfigData
  ): js.Function2[/* target */ js.Any, /* memberName */ java.lang.String | js.Symbol, scala.Unit] = js.native
}

