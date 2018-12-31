package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of phone call history entries. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryStore")
@js.native
abstract class PhoneCallHistoryStore () extends js.Object {
  /**
    * Deletes entries in the store.
    * @param callHistoryEntries The entries to delete.
    */
  def deleteEntriesAsync(
    callHistoryEntries: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[PhoneCallHistoryEntry]
  ): js.Any = js.native
   /* unmapped return type */ /**
    * Delete an entry from the store.
    * @param callHistoryEntry The entry to delete.
    */
  def deleteEntryAsync(callHistoryEntry: PhoneCallHistoryEntry): js.Any = js.native
   /* unmapped return type */ /**
    * Gets an entry from the store based on the entry id.
    * @param callHistoryEntryId The PhoneCallHistoryEntryt.Id of the relevant entry.
    */
  def getEntryAsync(callHistoryEntryId: java.lang.String): js.Any = js.native
  /**
    * Retrieves a default phone call history entry that reads all entries.
    * @return A reader that can be used to go through the phone call log entries.
    */
  def getEntryReader(): PhoneCallHistoryEntryReader = js.native
   /* unmapped return type */ /**
    * Retrieves an entry reader based on provided filters.
    * @param queryOptions The options used to create a filtered entry reader.
    * @return A reader that can be used to go through the phone call log entries.
    */
  def getEntryReader(queryOptions: PhoneCallHistoryEntryQueryOptions): PhoneCallHistoryEntryReader = js.native
  /**
    * Gets the number of unseen log entries for the provided sources.
    * @param sourceIds The identifiers that need to match PhoneCallHistoryEntry.SourceId in order for that entry to be considered.
    * @return The total number of unseen entries matching all of the identifiers provided by sourceIds.
    */
  def getSourcesUnseenCountAsync(sourceIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double] = js.native
  /**
    * Gets the number of unseen entries.
    * @return The number of unseen entries.
    */
  def getUnseenCountAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double] = js.native
  /**
    * Update all the entries to indicate they have all been seen by the user.
    */
  def markAllAsSeenAsync(): js.Any = js.native
   /* unmapped return type */ /**
    * Updates entries to indicate they have been seen by the user.
    * @param callHistoryEntries The entries to mark as seen. This updates the PhoneCallHistoryEntry.IsSeen property.
    */
  def markEntriesAsSeenAsync(
    callHistoryEntries: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[PhoneCallHistoryEntry]
  ): js.Any = js.native
   /* unmapped return type */ /**
    * Updates an entry to indicate it has been seen.
    * @param callHistoryEntry The entry to update.
    */
  def markEntryAsSeenAsync(callHistoryEntry: PhoneCallHistoryEntry): js.Any = js.native
   /* unmapped return type */ /**
    * Marks all entries from the specified sources as seen.
    * @param sourceIds The list of source identifiers to mark as seen. Only entries that match PhoneCallHistoryEntry.SourceId will be updated.
    */
  def markSourcesAsSeenAsync(sourceIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): js.Any = js.native
   /* unmapped return type */ /**
    * Saves an entry to the store.
    * @param callHistoryEntry The entry to save.
    */
  def saveEntryAsync(callHistoryEntry: PhoneCallHistoryEntry): js.Any = js.native
}

