package typings
package universalDashRouterLib.generateUrlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GenerateUrlsOptions
  extends pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.PathFunctionOptions {
  /**
       * Provide a function to stringifyQueryParams option to generate URL with query string from unknown route params.
       */
  var stringifyQueryParams: js.UndefOr[
    js.Function1[
      /* params */ universalDashRouterLib.universalDashRouterMod.Params, 
      java.lang.String
    ]
  ] = js.undefined
}

