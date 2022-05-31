package typings.tabris.global.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Storage
/**
  * The `localStorage` object allows storing key-value pairs in a persistent store. Both keys and values
  * are stored as strings.
  * In addition Tabris.js adds support for a `secureStorage` available in the global scope. This is a
  * drop-in replacement for `localStorage` that keeps data encrypted using the Keychain on iOS and the
  * AndroidKeyStore on Android 6+. Note that on Android 5 the store is encrypted but does not use
  * hardware encryption.
  * The `localStorage` is only meant to store relatively short strings. To store larger amounts of data
  * it is recommended to use the [FileSystem](./fs.html) API.
  */
/* was `typeof Storage` */
@JSGlobal("tabris.Storage")
@js.native
/* private */ class Storage ()
  extends typings.tabris.mod.Storage
