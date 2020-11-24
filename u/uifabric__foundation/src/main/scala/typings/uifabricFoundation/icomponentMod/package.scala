package typings.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object icomponentMod {
  
  type IPartialSlotComponent[TComponentProps /* <: typings.uifabricFoundation.libIslotsMod.ISlottableProps[TComponentSlots] */, TComponentSlots] = typings.uifabricFoundation.libIslotsMod.ISlotDefinition[TComponentSlots] | (js.Function1[
    /* props */ TComponentProps, 
    typings.uifabricFoundation.libIslotsMod.ISlotDefinition[TComponentSlots]
  ])
  
  type ISlotComponent[TComponentProps /* <: typings.uifabricFoundation.libIslotsMod.ISlottableProps[TComponentSlots] */, TComponentSlots] = typings.uifabricFoundation.libIslotsMod.ISlotDefinition[typings.std.Required[TComponentSlots]] | (js.Function1[
    /* props */ TComponentProps, 
    typings.uifabricFoundation.libIslotsMod.ISlotDefinition[typings.std.Required[TComponentSlots]]
  ])
  
  type IViewComponent[TViewProps, TComponentSlots] = js.Function2[
    /* props */ typings.react.mod.PropsWithChildren[TViewProps], 
    /* slots */ typings.uifabricFoundation.libIslotsMod.ISlots[typings.std.Required[TComponentSlots]], 
    typings.std.ReturnType[typings.react.mod.FunctionComponent[js.Object]]
  ]
}
