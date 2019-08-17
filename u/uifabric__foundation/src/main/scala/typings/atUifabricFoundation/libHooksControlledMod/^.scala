package typings.atUifabricFoundation.libHooksControlledMod

import typings.react.reactMod.Dispatch
import typings.react.reactMod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/hooks/controlled", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getControlledDerivedProps[TProps, TProp /* <: String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any = js.native
  def useControlledState[TProps, TProp /* <: String */, TDefaultProp /* <: String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def useControlledState[TProps, TProp /* <: String */, TDefaultProp /* <: String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
}

