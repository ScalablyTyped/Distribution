package typings.uifabricFoundation

import typings.react.mod.Attributes
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.Required
import typings.std.ReturnType
import typings.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typings.uifabricFoundation.libIslotsMod.ISlot
import typings.uifabricFoundation.libIslotsMod.ISlotDefinition
import typings.uifabricFoundation.libIslotsMod.ISlotFactory
import typings.uifabricFoundation.libIslotsMod.ISlots
import typings.uifabricFoundation.libIslotsMod.ISlottableProps
import typings.uifabricFoundation.libIslotsMod.ValidProps
import typings.uifabricFoundation.libIslotsMod.ValidShorthand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotsMod {
  
  @JSImport("@uifabric/foundation/lib/slots", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps]): ISlotFactory[TProps, TShorthandProp] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(DefaultComponent.asInstanceOf[js.Any]).asInstanceOf[ISlotFactory[TProps, TShorthandProp]]
  inline def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(DefaultComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ISlotFactory[TProps, TShorthandProp]]
  
  inline def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(userProps.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[ISlots[Required[TComponentSlots]]]
  
  inline def withSlots[P](`type`: String, props: Attributes & P, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: String, props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: String, props: Unit, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: ISlot[P], props: Attributes & P, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: ISlot[P], props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: ISlot[P], props: Unit, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
}
