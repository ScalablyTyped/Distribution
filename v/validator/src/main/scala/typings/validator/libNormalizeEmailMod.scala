package typings.validator

import org.scalablytyped.runtime.TopLevel
import typings.validator.ValidatorJS.NormalizeEmailOptions
import typings.validator.validatorNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/normalizeEmail", JSImport.Namespace)
@js.native
object libNormalizeEmailMod
  extends TopLevel[
      (js.Function2[
        /* email */ String, 
        /* options */ js.UndefOr[NormalizeEmailOptions], 
        String | `false`
      ]) with (/* import warning: ResolveTypeQueries.resolve Loop while resolving typeof validator.normalizeEmail */ js.Any)
    ]

