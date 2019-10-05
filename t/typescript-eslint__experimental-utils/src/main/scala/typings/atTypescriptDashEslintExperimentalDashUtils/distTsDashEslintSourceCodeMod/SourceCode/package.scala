package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SourceCode {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atTypescriptDashEslintExperimentalDashUtils.Anon_Count
  import typings.atTypescriptDashEslintExperimentalDashUtils.Anon_Filter
  import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Comment
  import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Token

  type CursorWithCountOptions = Double | FilterPredicate | Anon_Count
  type CursorWithSkipOptions = Double | FilterPredicate | Anon_Filter
  type FilterPredicate = js.Function1[/* tokenOrComment */ Token | Comment, Boolean]
  type VisitorKeys = StringDictionary[js.Array[String]]
}
