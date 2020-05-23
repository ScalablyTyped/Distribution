package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a scene analysis video effect. */
trait SceneAnalysisEffectDefinition extends js.Object {
  /** Gets a string containing the activatable class ID of the scene analysis effect definition. */
  var activatableClassId: String
  /** Gets the set of properties for configuring the SceneAnalysisEffectDefinition object. */
  var properties: IPropertySet
}

object SceneAnalysisEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): SceneAnalysisEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneAnalysisEffectDefinition]
  }
}

