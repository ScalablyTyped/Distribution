package typings
package uiDashRouterDashExtrasLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky state
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait IStickyState extends js.Object {
  /*
    * The most-recently-activate substate of the DSR marked state is remembered.
    * When the DSR marked state is transitioned to directly, UI-Router Extras will instead redirect to the remembered state and parameters.
    * Docs: http://christopherthielen.github.io/ui-router-extras/#/dsr
    */
  var deepStateRedirect: js.UndefOr[scala.Boolean | IDeepStateRedirectConfig] = js.undefined
  /*
    * Shortname deepStateRedirect prop
    */
  var dsr: js.UndefOr[scala.Boolean | IDeepStateRedirectConfig] = js.undefined
  /*
    * Function (injectable). Called when a sticky state is navigated away from (inactivated).
    */
  var onInactivate: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /*
    * Function (injectable). Called when an inactive sticky state is navigated to (reactivated).
    */
  var onReactivate: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  /*
    * When marking a state sticky, the state must target its own unique named ui-view.
    * Docs: http://christopherthielen.github.io/ui-router-extras/#/sticky
    */
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Note: named views are mandatory when using sticky states!
    */
  var views: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IState */ js.Any
    ]
  ] = js.undefined
}

