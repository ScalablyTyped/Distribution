package typings.uiRouterExtras.mod.ui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky state
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState * / any */ trait IStickyState extends js.Object {
  /*
    * The most-recently-activate substate of the DSR marked state is remembered.
    * When the DSR marked state is transitioned to directly, UI-Router Extras will instead redirect to the remembered state and parameters.
    * Docs: http://christopherthielen.github.io/ui-router-extras/#/dsr
    */
  var deepStateRedirect: js.UndefOr[Boolean | IDeepStateRedirectConfig] = js.undefined
  /*
    * Shortname deepStateRedirect prop
    */
  var dsr: js.UndefOr[Boolean | IDeepStateRedirectConfig] = js.undefined
  /*
    * Function (injectable). Called when a sticky state is navigated away from (inactivated).
    */
  var onInactivate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /*
    * Function (injectable). Called when an inactive sticky state is navigated to (reactivated).
    */
  var onReactivate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /*
    * When marking a state sticky, the state must target its own unique named ui-view.
    * Docs: http://christopherthielen.github.io/ui-router-extras/#/sticky
    */
  var sticky: js.UndefOr[Boolean] = js.undefined
  /*
    * Note: named views are mandatory when using sticky states!
    */
  var views: js.UndefOr[
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
    ]
  ] = js.undefined
}

object IStickyState {
  @scala.inline
  def apply(
    deepStateRedirect: Boolean | IDeepStateRedirectConfig = null,
    dsr: Boolean | IDeepStateRedirectConfig = null,
    onInactivate: /* repeated */ js.Any => Unit = null,
    onReactivate: /* repeated */ js.Any => Unit = null,
    sticky: js.UndefOr[Boolean] = js.undefined,
    views: StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
    ] = null
  ): IStickyState = {
    val __obj = js.Dynamic.literal()
    if (deepStateRedirect != null) __obj.updateDynamic("deepStateRedirect")(deepStateRedirect.asInstanceOf[js.Any])
    if (dsr != null) __obj.updateDynamic("dsr")(dsr.asInstanceOf[js.Any])
    if (onInactivate != null) __obj.updateDynamic("onInactivate")(js.Any.fromFunction1(onInactivate))
    if (onReactivate != null) __obj.updateDynamic("onReactivate")(js.Any.fromFunction1(onReactivate))
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.get.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStickyState]
  }
}

