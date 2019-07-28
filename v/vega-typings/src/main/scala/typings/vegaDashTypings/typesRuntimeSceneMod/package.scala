package typings.vegaDashTypings

import typings.vegaDashTypings.Anon_Align
import typings.vegaDashTypings.Anon_Context
import typings.vegaDashTypings.Anon_FillHeight
import typings.vegaDashTypings.Anon_FillShape
import typings.vegaDashTypings.Anon_Opacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesRuntimeSceneMod {
  type SceneGroup = SceneItem with Anon_Context
  type SceneLine = SceneItem with Anon_Opacity
  type SceneRect = SceneItem with Anon_FillHeight
  type SceneSymbol = SceneItem with Anon_FillShape
  type SceneText = SceneItem with Anon_Align
}
