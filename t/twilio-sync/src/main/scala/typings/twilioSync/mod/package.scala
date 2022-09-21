package typings.twilioSync.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Client connection state.
  * Directly reflects connection state of the underlying websocket transport.
  * Possible values are as follows:
  * * 'connecting' - client is offline and connection attempt is in process.
  * * 'connected' - client is online and ready.
  * * 'disconnecting' - client is going offline as disconnection is in process.
  * * 'disconnected' - client is offline and no connection attempt is in process.
  * * 'denied' - client connection is denied because of invalid JWT access token. User must refresh token in order to proceed.
  * * 'error' - client connection is in a permanent erroneous state. Client re-initialization is required.
  */
type ConnectionState = typings.twilsock.mod.ConnectionState

type DocumentServices = EntityServices

type InsightsServices = EntityServices

/**
  * A result set, i.e. a collection of items that matched a LiveQuery or InstantQuery expression.
  * Each result is a key-value pair, where each key identifies its object uniquely. These
  * results are equivalent to a set of InsightsItem-s.
  */
type ItemsSnapshot = StringDictionary[js.Object]

/**
  * Applies a transformation to the data of a Sync entity. May be called multiple times on the
  * same datum in case of collisions with remote code.
  *
  * @param currentValue Current data of the Sync entity in the cloud.
  * @return Desired new data for the item or `null` to gracefully cancel the mutation.
  */
type Mutator = js.Function1[/* currentValue */ js.Object, js.Object]

/**
  * Stream options.
  */
type OpenStreamOptions = OpenOptions

type RemovalHandler = js.Function3[/* type */ String, /* sid */ String, /* uniqueName */ String, Unit]

type SyncListServices = EntityServices

type SyncMapServices = EntityServices

type SyncStreamServices = EntityServices

type json = StringDictionary[Any]
