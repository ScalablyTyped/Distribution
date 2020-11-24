package typings.tuyaPanelKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stackTypesMod {
  
  type StackCardStyleInterpolator = js.Function1[
    /* props */ typings.tuyaPanelKit.stackTypesMod.StackCardInterpolationProps, 
    typings.tuyaPanelKit.stackTypesMod.StackCardInterpolatedStyle
  ]
  
  type StackDescriptor = typings.tuyaPanelKit.typesMod.Descriptor[
    typings.tuyaPanelKit.routersTypesMod.ParamListBase, 
    java.lang.String, 
    typings.tuyaPanelKit.stackRouterMod.StackNavigationState[typings.tuyaPanelKit.routersTypesMod.ParamListBase], 
    typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions, 
    js.Object
  ]
  
  type StackDescriptorMap = org.scalablytyped.runtime.StringDictionary[typings.tuyaPanelKit.stackTypesMod.StackDescriptor]
  
  type StackHeaderStyleInterpolator = js.Function1[
    /* props */ typings.tuyaPanelKit.stackTypesMod.StackHeaderInterpolationProps, 
    typings.tuyaPanelKit.stackTypesMod.StackHeaderInterpolatedStyle
  ]
}
