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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/slots", JSImport.Namespace)
@js.native
object slotsMod extends js.Object {
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = js.native
  def withSlots[P](`type`: String, props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
}

