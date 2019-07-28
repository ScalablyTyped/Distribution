package typings.validator

import org.scalablytyped.runtime.TopLevel
import typings.validator.validatorNumbers.`3`
import typings.validator.validatorNumbers.`4`
import typings.validator.validatorNumbers.`5`
import typings.validator.validatorStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isUUID", JSImport.Namespace)
@js.native
object libIsUUIDMod
  extends TopLevel[
      (js.Function2[
        /* str */ String, 
        /* version */ js.UndefOr[
          `3` | `4` | `5` | typings.validator.validatorStrings.`3` | typings.validator.validatorStrings.`4` | typings.validator.validatorStrings.`5` | all
        ], 
        Boolean
      ]) with (/* import warning: ResolveTypeQueries.resolve Loop while resolving typeof validator.isUUID */ js.Any)
    ]

