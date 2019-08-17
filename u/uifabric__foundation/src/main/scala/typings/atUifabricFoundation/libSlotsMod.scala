package typings.atUifabricFoundation

import typings.atUifabricFoundation.libIComponentMod.IFactoryOptions
import typings.atUifabricFoundation.libISlotsMod.ISlot
import typings.atUifabricFoundation.libISlotsMod.ISlotDefinition
import typings.atUifabricFoundation.libISlotsMod.ISlotFactory
import typings.atUifabricFoundation.libISlotsMod.ISlots
import typings.atUifabricFoundation.libISlotsMod.ISlottableProps
import typings.atUifabricFoundation.libISlotsMod.ValidProps
import typings.atUifabricFoundation.libISlotsMod.ValidShorthand
import typings.react.reactMod.Attributes
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.ReactNode
import typings.std.Required
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/slots", JSImport.Namespace)
@js.native
object libSlotsMod extends js.Object {
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = js.native
  def withSlots[P](`type`: String): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P]): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P]): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
}

