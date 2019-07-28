package typings.validator

import org.scalablytyped.runtime.TopLevel
import typings.validator.ValidatorJSNs.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isHash", JSImport.Namespace)
@js.native
object libIsHashMod
  extends TopLevel[
      (js.Function2[/* str */ String, /* algorithm */ HashAlgorithm, Boolean]) with (/* import warning: ResolveTypeQueries.resolve Loop while resolving typeof validator.isHash */ js.Any)
    ]

