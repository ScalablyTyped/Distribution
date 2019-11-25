package typings.atWordpressCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/compose", JSImport.Namespace)
@js.native
object atWordpressComposeMod extends js.Object {
  // tslint:disable:no-unnecessary-generics
  // prettier-ignore
  def createHigherOrderComponent[EP](
    mapComponentToEnhancedComponent: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ /* component */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ _
    ],
    modifierName: String
  ): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ /* component */ js.Any, 
    _
  ] = js.native
  def ifCondition[P](predicate: js.Function1[/* props */ P, Boolean]): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P> */ /* component */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FC<P> */ _
  ] = js.native
  // prettier-ignore
  def pure[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ js.Any */](component: T): js.Any = js.native
  def useMediaQuery(query: String): Boolean = js.native
  def useReducedMotion(): Boolean = js.native
  // prettier-ignore
  def withGlobalEvents(
    eventMapper: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in 'abort' | 'afterprint' | 'beforeprint' | 'beforeunload' | 'blur' | 'canplay' | 'canplaythrough' | 'change' | 'click' | 'compassneedscalibration' | 'contextmenu' | 'dblclick' | 'devicelight' | 'devicemotion' | 'deviceorientation' | 'deviceorientationabsolute' | 'drag' | 'dragend' | 'dragenter' | 'dragleave' | 'dragover' | 'dragstart' | 'drop' | 'durationchange' | 'emptied' | 'ended' | 'error' | 'focus' | 'hashchange' | 'input' | 'invalid' | 'keydown' | 'keypress' | 'keyup' | 'load' | 'loadeddata' | 'loadedmetadata' | 'loadstart' | 'message' | 'mousedown' | 'mouseenter' | 'mouseleave' | 'mousemove' | 'mouseout' | 'mouseover' | 'mouseup' | 'mousewheel' | 'MSGestureChange' | 'MSGestureDoubleTap' | 'MSGestureEnd' | 'MSGestureHold' | 'MSGestureStart' | 'MSGestureTap' | 'MSInertiaStart' | 'MSPointerCancel' | 'MSPointerDown' | 'MSPointerEnter' | 'MSPointerLeave' | 'MSPointerMove' | 'MSPointerOut' | 'MSPointerOver' | 'MSPointerUp' | 'offline' | 'online' | 'orientationchange' | 'pagehide' | 'pageshow' | 'pause' | 'play' | 'playing' | 'popstate' | 'progress' | 'ratechange' | 'readystatechange' | 'reset' | 'resize' | 'scroll' | 'seeked' | 'seeking' | 'select' | 'stalled' | 'storage' | 'submit' | 'suspend' | 'timeupdate' | 'unload' | 'volumechange' | 'vrdisplayactivate' | 'vrdisplayblur' | 'vrdisplayconnect' | 'vrdisplaydeactivate' | 'vrdisplaydisconnect' | 'vrdisplayfocus' | 'vrdisplaypointerrestricted' | 'vrdisplaypointerunrestricted' | 'vrdisplaypresentchange' | 'waiting' ]:? string}
    */ typings.atWordpressCompose.atWordpressComposeStrings.withGlobalEvents with js.Any
  ): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentClass<any> */ /* component */ js.Any, 
    _
  ] = js.native
  // prettier-ignore
  def withInstanceId[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ js.Any */](wrapped: T): js.Any = js.native
  // prettier-ignore
  def withSafeTimeout[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ js.Any */](component: T): js.Any = js.native
  // prettier-ignore
  def withState[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof SP ]: SP[k]}
    */ typings.atWordpressCompose.atWordpressComposeStrings.withState with SP
  ): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ /* component */ js.Any, 
    _
  ] = js.native
}

