package typings.uifabricFoundation

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.uifabricFoundation.libHooksControlledMod.IControlledStateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksMod {
  
  @JSImport("@uifabric/foundation/lib/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getControlledDerivedProps[TProps, TProp /* <: /* keyof TProps */ String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlledDerivedProps")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], derivedValue.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any]
  
  inline def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ]]
  inline def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ]]
}
