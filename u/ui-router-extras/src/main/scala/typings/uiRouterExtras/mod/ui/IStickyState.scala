package typings.uiRouterExtras.mod.ui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky state
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState * / any */ @js.native
trait IStickyState extends js.Object {
  /*
    * The most-recently-activate substate of the DSR marked state is remembered.
    * When the DSR marked state is transitioned to directly, UI-Router Extras will instead redirect to the remembered state and parameters.
    * Docs: http://christopherthielen.github.io/ui-router-extras/#/dsr
    */
  var deepStateRedirect: js.UndefOr[Boolean | IDeepStateRedirectConfig] = js.native
  /*
    * Shortname deepStateRedirect prop
    */
  var dsr: js.UndefOr[Boolean | IDeepStateRedirectConfig] = js.native
  /*
    * Function (injectable). Called when a sticky state is navigated away from (inactivated).
    */
  var onInactivate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /*
    * Function (injectable). Called when an inactive sticky state is navigated to (reactivated).
    */
  var onReactivate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /*
    * When marking a state sticky, the state must target its own unique named ui-view.
    * Docs: http://christopherthielen.github.io/ui-router-extras/#/sticky
    */
  var sticky: js.UndefOr[Boolean] = js.native
  /*
    * Note: named views are mandatory when using sticky states!
    */
  var views: js.UndefOr[
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
    ]
  ] = js.native
}

object IStickyState {
  @scala.inline
  def apply(): IStickyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStickyState]
  }
  @scala.inline
  implicit class IStickyStateOps[Self <: IStickyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeepStateRedirect(value: Boolean | IDeepStateRedirectConfig): Self = this.set("deepStateRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepStateRedirect: Self = this.set("deepStateRedirect", js.undefined)
    @scala.inline
    def setDsr(value: Boolean | IDeepStateRedirectConfig): Self = this.set("dsr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDsr: Self = this.set("dsr", js.undefined)
    @scala.inline
    def setOnInactivate(value: /* repeated */ js.Any => Unit): Self = this.set("onInactivate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInactivate: Self = this.set("onInactivate", js.undefined)
    @scala.inline
    def setOnReactivate(value: /* repeated */ js.Any => Unit): Self = this.set("onReactivate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReactivate: Self = this.set("onReactivate", js.undefined)
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
    @scala.inline
    def setViews(
      value: StringDictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
        ]
    ): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

