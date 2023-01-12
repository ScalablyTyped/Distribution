package typings.twineSugarcube.anon

import typings.twineSugarcube.extensionsMod.global.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clear extends StObject {
  
  /**
    * Adds an audio group with the given group ID. Groups are useful for applying actions to multiple tracks
    * simultaneously and/or excluding the included tracks from a larger set when applying actions.
    * @param groupId The ID of the group, which will be used to reference it and must begin with a colon.
    * NOTE: There are several predefined group IDs (:all, :looped, :muted, :paused, :playing) and the :not group
    * modifier that cannot be reused/overwritten.
    * @param trackIds The IDs of the tracks to make part of the group, which may be a list of track IDs or an array.
    * @since 2.28.0
    * @example
    * // Set up a group ":ui" with the tracks: "ui_beep", "ui_boop", and "ui_swish"
    * SimpleAudio.groups.add(":ui", "ui_beep", "ui_boop", "ui_swish");
    */
  def add(groupId: String, trackIds: String*): Unit
  
  /**
    * Deletes all audio groups.
    * NOTE: Only deletes the groups themselves, does not affect their component tracks.
    * @since 2.28.0
    */
  def clear(): Unit
  
  /**
    * Deletes the audio group with the given group ID.
    * NOTE: Only deletes the group itself, does not affect its component tracks.
    * @param groupId The ID of the group.
    * @since 2.28.0
    * @example
    * SimpleAudio.groups.delete(":ui");
    */
  def delete(groupId: String): Unit
  
  /**
    * Returns the array of track IDs with the given group ID, or null on failure.
    * NOTE: To actually affect multiple tracks and/or groups, see the SimpleAudio.select() method.
    * @param groupId The ID of the group.
    * @since 2.28.0
    * @example
    * SimpleAudio.groups.get(":ui")  → Returns the array of track IDs matching ":ui"
    */
  def get(groupId: String): Array[String]
  
  /**
    * Returns whether an audio group with the given group ID exists.
    * @param groupId The ID of the group.
    * @since 2.28.0
    */
  def has(groupId: String): Boolean
}
object Clear {
  
  inline def apply(
    add: (String, /* repeated */ String) => Unit,
    clear: () => Unit,
    delete: String => Unit,
    get: String => Array[String],
    has: String => Boolean
  ): Clear = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Clear]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clear] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (String, /* repeated */ String) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: String => Array[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
  }
}
