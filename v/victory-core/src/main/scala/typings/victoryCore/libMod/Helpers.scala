package typings.victoryCore.libMod

import typings.react.mod.ReactNode
import typings.std.Omit
import typings.victoryCore.anon.Bottom
import typings.victoryCore.anon.X0
import typings.victoryCore.anon.Y
import typings.victoryCore.libTypesCallbacksMod.CallbackArgs
import typings.victoryCore.libTypesPropTypesMod.ValueOrAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Helpers {
  
  @JSImport("victory-core/lib", "Helpers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAccessor(key: Any): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccessor")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  inline def degreesToRadians(degrees: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("degreesToRadians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def evaluateProp[TValue](prop: ValueOrAccessor[TValue, CallbackArgs], props: CallbackArgs): TValue = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateProp")(prop.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[TValue]
  
  inline def evaluateStyle(style: Any, props: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateStyle")(style.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getCurrentAxis(axis: Any, horizontal: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentAxis")(axis.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDefaultStyles(props: Any, role: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStyles")(props.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getPadding(props: Any): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("getPadding")(props.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  inline def getPadding(props: Any, name: String): Bottom = (^.asInstanceOf[js.Dynamic].applyDynamic("getPadding")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Bottom]
  
  inline def getPoint(datum: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPoint")(datum.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getPolarOrigin(props: Any): Y = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolarOrigin")(props.asInstanceOf[js.Any]).asInstanceOf[Y]
  
  inline def getRadius(props: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadius")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getRange(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getStyles(style: Any, defaultStyles: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(style.asInstanceOf[js.Any], defaultStyles.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isHorizontal(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isHorizontal")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isTooltip(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTooltip")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def modifyProps(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyProps")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def modifyProps(props: Any, fallbackProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def modifyProps(props: Any, fallbackProps: Any, role: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def modifyProps(props: Any, fallbackProps: Unit, role: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def omit[T, Keys /* <: /* keyof T */ String */](originalObject: T): Omit[T, Keys] = ^.asInstanceOf[js.Dynamic].applyDynamic("omit")(originalObject.asInstanceOf[js.Any]).asInstanceOf[Omit[T, Keys]]
  inline def omit[T, Keys /* <: /* keyof T */ String */](originalObject: T, ks: js.Array[Keys]): Omit[T, Keys] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(originalObject.asInstanceOf[js.Any], ks.asInstanceOf[js.Any])).asInstanceOf[Omit[T, Keys]]
  
  inline def radiansToDegrees(radians: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("radiansToDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
    children: js.Array[TChildren],
    iteratee: js.Function3[
      /* child */ TChildren, 
      /* childName */ String, 
      /* parent */ js.UndefOr[TChildren], 
      TItem | Null
    ]
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
    children: js.Array[TChildren],
    iteratee: js.Function3[
      /* child */ TChildren, 
      /* childName */ String, 
      /* parent */ js.UndefOr[TChildren], 
      TItem | Null
    ],
    parentProps: js.Object
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
    children: js.Array[TChildren],
    iteratee: js.Function3[
      /* child */ TChildren, 
      /* childName */ String, 
      /* parent */ js.UndefOr[TChildren], 
      TItem | Null
    ],
    parentProps: js.Object,
    initialMemo: TResult
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
    children: js.Array[TChildren],
    iteratee: js.Function3[
      /* child */ TChildren, 
      /* childName */ String, 
      /* parent */ js.UndefOr[TChildren], 
      TItem | Null
    ],
    parentProps: js.Object,
    initialMemo: TResult,
    combine: js.Function2[/* memo */ TResult, /* item */ TItem, TResult]
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
    children: js.Array[TChildren],
    iteratee: js.Function3[
      /* child */ TChildren, 
      /* childName */ String, 
      /* parent */ js.UndefOr[TChildren], 
      TItem | Null
    ],
    parentProps: js.Object,
    initialMemo: Unit,
    combine: js.Function2[/* memo */ TResult, /* item */ TItem, TResult]
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
    children: js.Array[TChildren],
    iteratee: js.Function3[
      /* child */ TChildren, 
      /* childName */ String, 
      /* parent */ js.UndefOr[TChildren], 
      TItem | Null
    ],
    parentProps: Unit,
    initialMemo: TResult
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
    children: js.Array[TChildren],
    iteratee: js.Function3[
      /* child */ TChildren, 
      /* childName */ String, 
      /* parent */ js.UndefOr[TChildren], 
      TItem | Null
    ],
    parentProps: Unit,
    initialMemo: TResult,
    combine: js.Function2[/* memo */ TResult, /* item */ TItem, TResult]
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
    children: js.Array[TChildren],
    iteratee: js.Function3[
      /* child */ TChildren, 
      /* childName */ String, 
      /* parent */ js.UndefOr[TChildren], 
      TItem | Null
    ],
    parentProps: Unit,
    initialMemo: Unit,
    combine: js.Function2[/* memo */ TResult, /* item */ TItem, TResult]
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[TResult]
  
  inline def scalePoint(props: Any, datum: Any): X0 = (^.asInstanceOf[js.Dynamic].applyDynamic("scalePoint")(props.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[X0]
}
