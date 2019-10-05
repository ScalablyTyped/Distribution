package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint/SourceCode", "SourceCode")
@js.native
class ^ protected ()
  extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode {
  def this(config: Config) = this()
  def this(text: String, ast: Program) = this()
}

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint/SourceCode", "SourceCode")
@js.native
object ^
  extends TopLevel[
      (Instantiable2[
        /* text */ String, 
        /* ast */ Program, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode
      ]) with (Instantiable1[
        /* config */ Config, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode
      ])
    ] {
  def splitLines(text: String): js.Array[String] = js.native
}

