package typings.uifabricFoundation

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlledMod {
  
  @JSImport("@uifabric/foundation/lib/hooks/controlled", "getControlledDerivedProps")
  @js.native
  def getControlledDerivedProps[TProps, TProp /* <: /* keyof TProps */ String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = js.native
  
  @JSImport("@uifabric/foundation/lib/hooks/controlled", "useControlledState")
  @js.native
  def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  @JSImport("@uifabric/foundation/lib/hooks/controlled", "useControlledState")
  @js.native
  def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  
  @js.native
  trait IControlledStateOptions[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */] extends StObject {
    
    var defaultPropName: js.UndefOr[TDefaultProp] = js.native
    
    var defaultPropValue: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ] = js.native
  }
  object IControlledStateOptions {
    
    @scala.inline
    def apply[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](): IControlledStateOptions[TProps, TProp, TDefaultProp] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlledStateOptions[TProps, TProp, TDefaultProp]]
    }
    
    @scala.inline
    implicit class IControlledStateOptionsMutableBuilder[Self <: IControlledStateOptions[_, _, _], TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */] (val x: Self with (IControlledStateOptions[TProps, TProp, TDefaultProp])) extends AnyVal {
      
      @scala.inline
      def setDefaultPropName(value: TDefaultProp): Self = StObject.set(x, "defaultPropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPropNameUndefined: Self = StObject.set(x, "defaultPropName", js.undefined)
      
      @scala.inline
      def setDefaultPropValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ): Self = StObject.set(x, "defaultPropValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPropValueUndefined: Self = StObject.set(x, "defaultPropValue", js.undefined)
    }
  }
}
