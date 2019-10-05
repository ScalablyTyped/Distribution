package typings.validator

import org.scalablytyped.runtime.TopLevel
import typings.validator.ValidatorJS.IsMobilePhoneOptions
import typings.validator.ValidatorJS.MobilePhoneLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isMobilePhone", JSImport.Namespace)
@js.native
object libIsMobilePhoneMod
  extends TopLevel[
      (js.Function3[
        /* str */ String, 
        /* locale */ js.UndefOr[MobilePhoneLocale | js.Array[MobilePhoneLocale]], 
        /* options */ js.UndefOr[IsMobilePhoneOptions], 
        Boolean
      ]) with (/* import warning: ResolveTypeQueries.resolve Loop while resolving typeof validator.isMobilePhone */ js.Any)
    ]

