package typings.webscreensWindowPlacement

import typings.std.PermissionDescriptor
import typings.webscreensWindowPlacement.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// enhance window.navigator.permissions.query({ name });
// Failed Attempts on adding an additional value to PermissionName type
// // TSError Duplicate identifier 'PermissionName'.
// type PermissionName = PermissionName | 'window-placement';
//
// interface PermissionDescriptor {
//   // TSError Subsequent property declarations must have the same type.
//   name: PermissionName | 'window-placement';
// }
//
// How I achieved it, but I am not happy about it.
type PermissionDescriptorWithWindowPlacement = PermissionDescriptor | Name
