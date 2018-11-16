package typings
package atUirouterAngularjsLib.libInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TemplateFactoryProvider extends js.Object {
  /**
       * Forces $templateFactory to use $http instead of $templateRequest.
       *
       * UI-Router uses `$templateRequest` by default on angular 1.3+.
       * Use this method to choose to use `$http` instead.
       *
       * ---
       *
       * ## Security warning
       *
       * This might cause XSS, as $http doesn't enforce the regular security checks for
       * templates that have been introduced in Angular 1.3.
       *
       * See the $sce documentation, section
       * <a href="https://docs.angularjs.org/api/ng/service/$sce#impact-on-loading-templates">
       * Impact on loading templates</a> for more details about this mechanism.
       *
       * *Note: forcing this to `false` on Angular 1.2.x will crash, because `$templateRequest` is not implemented.*
       *
       * @param useUnsafeHttpService `true` to use `$http` to fetch templates
       */
  def useHttpService(useUnsafeHttpService: scala.Boolean): js.Any
}

