package typings.twineSugarcube

import typings.jquery.JQuery.Event
import typings.twineSugarcube.anon.Add
import typings.twineSugarcube.anon.Clear
import typings.twineSugarcube.anon.Delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioMod {
  
  @js.native
  trait AudioList extends StObject {
    
    /**
      * Returns the playlist's total playtime in seconds, Infinity if it contains any streams, or NaN if no metadata exists.
      * @since 2.28.0
      */
    def duration(): Double = js.native
    
    /**
      * Starts playback of the playlist and fades the currently playing track between the specified starting and destination
      * volume levels over the specified number of seconds.
      * @param duration The number of seconds over which the currently playing track should be faded.
      * @param toVol The destination volume level.
      * @param fromVol The starting volume level. If omitted, defaults to the currently playing track's current volume level.
      * @since 2.29.0
      * @example
      * // Fade the playlist from volume 0 to 1 over 6 seconds.
      * aList.fade(6, 1, 0);
      */
    def fade(duration: Double, toVol: Double): js.Promise[Unit] = js.native
    def fade(duration: Double, toVol: Double, fromVol: Double): js.Promise[Unit] = js.native
    
    /**
      * Starts playback of the playlist and fades the currently playing track from the specified volume level to 1 (loudest)
      * over the specified number of seconds.
      * @param duration The number of seconds over which the currently playing track should be faded.
      * @param fromVol The starting volume level. If omitted, defaults to the currently playing track's current volume level.
      * @since 2.29.0
      * @example
      * // Fade the playlist in from volume 0 over 5 seconds.
      * aList.fadeIn(5, 0);
      */
    def fadeIn(duration: Double): js.Promise[Unit] = js.native
    def fadeIn(duration: Double, fromVol: Double): js.Promise[Unit] = js.native
    
    /**
      * Starts playback of the playlist and fades the currently playing track from the specified volume level to 0 (silent)
      * over the specified number of seconds.
      * @param duration The number of seconds over which the currently playing track should be faded.
      * @param fromVol The starting volume level. If omitted, defaults to the currently playing track's current volume level.
      * @since 2.29.0
      * @example
      * // Fade the playlist out from volume 1 over 8 seconds.
      * aList.fadeOut(8, 1);
      */
    def fadeOut(duration: Double): js.Promise[Unit] = js.native
    def fadeOut(duration: Double, fromVol: Double): js.Promise[Unit] = js.native
    
    /**
      * Interrupts an in-progress fade of the currently playing track, or does nothing if no fade is progressing.
      * NOTE: This does not alter the volume level.
      * @since 2.29.0
      */
    def fadeStop(): Unit = js.native
    
    /**
      * Returns whether playback of the playlist has ended.
      * @since 2.28.0
      */
    def isEnded(): Boolean = js.native
    
    /**
      * Returns whether a fade is in-progress on the currently playing track.
      * @since 2.29.0
      */
    def isFading(): Boolean = js.native
    
    /**
      * Returns whether playback of the playlist has been paused.
      * @since 2.28.0
      */
    def isPaused(): Boolean = js.native
    
    /**
      * Returns whether the playlist is playing.
      * @since 2.28.0
      */
    def isPlaying(): Boolean = js.native
    
    /**
      * Returns whether playback of the playlist has been stopped.
      * @since 2.29.0
      */
    def isStopped(): Boolean = js.native
    
    /**
      * Pauses playback of the playlist and, if they're not already in the process of loading, forces its tracks to drop
      * any existing data and begin loading.
      *
      * WARNING: This should not be done lightly if your audio sources are on the network, as it forces players to begin
      * downloading them.
      * @since 2.28.0
      *
      */
    def load(): Unit = js.native
    
    /**
      * Gets the playlist's repeating playback state (default: false).
      * @since 2.28.0
      */
    def loop(): Boolean = js.native
    /**
      * Sets the playlist's repeating playback state (default: false).
      * @param state The loop state.
      * @returns a reference to the current AudioList instance for chaining.
      * @since 2.28.0
      */
    def loop(state: Boolean): this.type = js.native
    
    /**
      * Gets the playlist's volume mute state (default: false).
      * @since 2.28.0
      */
    def mute(): Boolean = js.native
    /**
      * Gets or sets the playlist's volume mute state (default: false).
      * @param state The mute state.
      * @returns a reference to the current AudioList instance for chaining.
      * @since 2.28.0
      */
    def mute(state: Boolean): this.type = js.native
    
    /**
      * Pauses playback of the playlist.
      * @since 2.28.0
      */
    def pause(): Unit = js.native
    
    /**
      * Begins playback of the playlist.
      * @since 2.29.0
      */
    def play(): js.Promise[Unit] = js.native
    
    /**
      * Begins playback of the playlist or, failing that, sets the playlist to begin playback as soon as the player has
      * interacted with the document.
      * @since 2.29.0
      */
    def playWhenAllowed(): Unit = js.native
    
    /**
      * Returns how much remains of the playlist's total playtime in seconds, Infinity if it contains any streams,
      * or NaN if no metadata exists.
      * @since 2.28.0
      */
    def remaining(): Double = js.native
    
    /**
      * Gets the playlist's randomly shuffled playback state (default: false).
      * @since 2.28.0
      */
    def shuffle(): Boolean = js.native
    /**
      * Sets the playlist's randomly shuffled playback state (default: false).
      * @param state The shuffle state.
      * @returns a reference to the current AudioList instance for chaining.
      * @since 2.28.0
      */
    def shuffle(state: Boolean): this.type = js.native
    
    /**
      * Skips ahead to the next track in the playlist, if any.
      * @since 2.28.0
      */
    def skip(): Unit = js.native
    
    /**
      * Stops playback of the playlist.
      * @since 2.28.0
      */
    def stop(): Unit = js.native
    
    /**
      * Returns the playlist's current time in seconds, or NaN if no metadata exists.
      * @since 2.28.0
      */
    def time(): Double = js.native
    
    /**
      * Stops playback of the playlist and forces its tracks to drop any existing data.
      * NOTE: Once unloaded, playback cannot occur until the track's data is loaded again.
      * @since 2.28.0
      */
    def unload(): Unit = js.native
    
    /**
      * Gets the playlist's volume level (default: 1).
      */
    def volume(): Double = js.native
    /**
      * Sets the playlist's volume level (default: 1).
      * @param level The volume level to set. Valid values are floating-point numbers in the range 0 (silent) to 1
      * (loudest)—e.g., 0 is 0%, 0.5 is 50%, 1 is 100%.
      * @returns a reference to the current AudioList instance for chaining.
      */
    def volume(level: Double): this.type = js.native
  }
  
  @js.native
  trait AudioRunner extends StObject {
    
    /**
      * Starts playback of the selected tracks and fades them between the specified starting and destination volume levels
      * over the specified number of seconds.
      * @param duration The number of seconds over which the tracks should be faded.
      * @param toVol The destination volume level.
      * @param fromVol The starting volume level. If omitted, defaults to the tracks' current volume level.
      * @example
      * // Fade the selected tracks from volume 0 to 1 over 6 seconds.
      * someTracks.fade(6, 1, 0);
      * @since 2.28.0
      */
    def fade(duration: Double, toVol: Double): Unit = js.native
    def fade(duration: Double, toVol: Double, fromVol: Double): Unit = js.native
    
    /**
      * Starts playback of the selected tracks and fades them from the specified volume level to 1 (loudest) over the
      * specified number of seconds.
      * @param duration The number of seconds over which the tracks should be faded.
      * @param fromVol The starting volume level. If omitted, defaults to the tracks' current volume level.
      *
      * @example
      * // Fade the selected tracks in from volume 0 over 5 seconds.
      * someTracks.fadeIn(5, 0);
      * @since 2.28.0
      */
    def fadeIn(duration: Double): Unit = js.native
    def fadeIn(duration: Double, fromVol: Double): Unit = js.native
    
    /**
      * Starts playback of the selected tracks and fades them from the specified volume level to 0 (silent) over the
      * specified number of seconds.
      * @param duration The number of seconds over which the tracks should be faded.
      * @param fromVol The starting volume level. If omitted, defaults to the tracks' current volume level.
      * @example
      * // Fade the selected tracks out from volume 1 over 8 seconds.
      * someTracks.fadeOut(8, 1);
      * @since 2.28.0
      */
    def fadeOut(duration: Double): Unit = js.native
    def fadeOut(duration: Double, fromVol: Double): Unit = js.native
    
    /**
      * Interrupts an in-progress fade of the selected tracks, or does nothing if no fade is progressing.
      *
      * NOTE: This does not alter the volume level.
      * @example
      * someTracks.fadeStop();
      * @since 2.28.0
      */
    def fadeStop(): Unit = js.native
    
    /**
      * Pauses playback of the selected tracks and, if they're not already in the process of loading, forces them to
      * drop any existing data and begin loading.
      * WARNING: This should not be done lightly if your audio sources are on the network, as it forces players to
      * begin downloading them.
      * @example
      * someTracks.load();
      * @since 2.28.0
      */
    def load(): Unit = js.native
    
    /**
      * Sets the selected tracks' repeating playback state (default: false). Returns a reference to the current
      * AudioRunner instance for chaining.
      * @param state The loop state (false by default).
      * @since 2.28.0
      * @example
      * // Loop the selected tracks.
      * someTracks.loop(true);
      *
      * // Unloop the selected tracks.
      * someTracks.loop(false);
      */
    def loop(): this.type = js.native
    def loop(state: Boolean): this.type = js.native
    
    /**
      * Sets the selected tracks' volume mute state (default: false). Returns a reference to the current
      * AudioRunner instance for chaining.
      * @param state The mute state (false by default).
      * @example
      * // Mute the selected tracks' volume.
      * someTracks.mute(true);
      *
      * // Unmute the selected tracks' volume.
      * someTracks.mute(false);
      * @since 2.28.0
      */
    def mute(): this.type = js.native
    def mute(state: Boolean): this.type = js.native
    
    /**
      * Removes event handlers from the selected tracks. Returns a reference to the current AudioRunner
      * instance for chaining.
      * NOTE: Shorthand for jQuery's .off() method applied to each of the audio elements.
      * WARNING: The SimpleAudio APIs use events internally for various pieces of functionality. To prevent
      * conflicts, it is strongly suggested that you specify a custom user namespace—e.g., .myEvents—when attaching
      * your own handlers. It is further strongly suggested that you provide that same custom user namespace when
      * removing them.
      * @see jQuery.off()
      * @param events One or more space-separated event types and optional namespaces, or just namespaces,
      * such as "click", "keydown.myPlugin", or ".myPlugin".
      * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
      * @param handler A handler function previously attached for the event(s), or the special value false.
      * @example
      * // Remove any handlers for the ended event.
      * someTracks.off('ended.myEvents');
      * @since 2.28.0
      */
    def off(events: String): this.type = js.native
    def off(events: String, selector: String): this.type = js.native
    def off(events: String, selector: String, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def off(events: String, selector: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def off(events: js.Object): this.type = js.native
    def off(events: js.Object, selector: String): this.type = js.native
    def off(events: js.Object, selector: String, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def off(events: js.Object, selector: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def off(events: Event): this.type = js.native
    def off(events: Event, selector: String): this.type = js.native
    def off(events: Event, selector: String, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def off(events: Event, selector: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    
    /**
      * Attaches event handlers to the selected tracks. Returns a reference to the current AudioRunner instance for chaining.
      * @param events
      * @param selector
      * @param data
      * @param handler
      * @since 2.28.0
      */
    def on(events: String): this.type = js.native
    def on(events: String, selector: String): this.type = js.native
    def on(events: String, selector: String, data: js.Any): this.type = js.native
    def on(events: String, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: String, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: String, selector: Unit, data: js.Any): this.type = js.native
    def on(events: String, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: String, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: js.Object): this.type = js.native
    def on(events: js.Object, selector: String): this.type = js.native
    def on(events: js.Object, selector: String, data: js.Any): this.type = js.native
    def on(events: js.Object, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: js.Object, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: js.Object, selector: Unit, data: js.Any): this.type = js.native
    def on(events: js.Object, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: js.Object, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: Event): this.type = js.native
    def on(events: Event, selector: String): this.type = js.native
    def on(events: Event, selector: String, data: js.Any): this.type = js.native
    def on(events: Event, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: Event, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: Event, selector: Unit, data: js.Any): this.type = js.native
    def on(events: Event, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def on(events: Event, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    
    /**
      * Attaches single-use event handlers to the selected tracks. Returns a reference to the current AudioRunner
      * instance for chaining.
      * @param events
      * @param selector
      * @param data
      * @param handler
      * @since 2.28.0
      */
    def one(events: String): this.type = js.native
    def one(events: String, selector: String): this.type = js.native
    def one(events: String, selector: String, data: js.Any): this.type = js.native
    def one(events: String, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: String, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: String, selector: Unit, data: js.Any): this.type = js.native
    def one(events: String, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: String, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: js.Object): this.type = js.native
    def one(events: js.Object, selector: String): this.type = js.native
    def one(events: js.Object, selector: String, data: js.Any): this.type = js.native
    def one(events: js.Object, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: js.Object, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: js.Object, selector: Unit, data: js.Any): this.type = js.native
    def one(events: js.Object, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: js.Object, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: Event): this.type = js.native
    def one(events: Event, selector: String): this.type = js.native
    def one(events: Event, selector: String, data: js.Any): this.type = js.native
    def one(events: Event, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: Event, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: Event, selector: Unit, data: js.Any): this.type = js.native
    def one(events: Event, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    def one(events: Event, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
    
    /**
      * Pauses playback of the selected tracks.
      * @since 2.28.0
      * @example
      * someTracks.pause();
      */
    def pause(): Unit = js.native
    
    /**
      * Begins playback of the selected tracks.
      * @since 2.28.0
      */
    def play(): Unit = js.native
    
    /**
      * Begins playback of the selected tracks or, failing that, sets the tracks to begin playback as soon as
      * the player has interacted with the document.
      * @since 2.28.0
      */
    def playWhenAllowed(): Unit = js.native
    
    /**
      * Stops playback of the selected tracks.
      * @since 2.28.0
      */
    def stop(): Unit = js.native
    
    /**
      * Sets the selected tracks' current time in seconds. Returns a reference to the current AudioRunner
      * instance for chaining.
      * @param seconds The time to set. Valid values are floating-point numbers in the range 0 (start) to
      * the maximum duration—e.g., 60 is 60 is sixty seconds in, 90.5 is ninety-point-five seconds in.
      * @since 2.28.0
      * @example
      * // Set the selected tracks' current time to 30 seconds from their beginning.
      * someTracks.time(30);
      */
    def time(seconds: Double): this.type = js.native
    
    /**
      * Stops playback of the selected tracks and forces them to drop any existing data.
      *
      * NOTE: Once unloaded, playback cannot occur until the selected tracks' data is loaded again.
      * @since 2.28.0
      */
    def unload(): Unit = js.native
    
    /**
      * Sets the selected tracks' volume level (default: 1). Returns a reference to the current AudioRunner
      * instance for chaining.
      * @param level The volume level to set. Valid values are floating-point numbers in the range 0 (silent)
      * to 1 (loudest)—e.g., 0 is 0%, 0.5 is 50%, 1 is 100%.
      * @since 2.28.0
      * @example
      * // Set the selected tracks' volume level to 75%.
      * someTracks.volume(0.75);
      */
    def volume(level: Double): this.type = js.native
  }
  
  @js.native
  trait AudioTrack extends StObject {
    
    /**
      * Returns the track's total playtime in seconds, Infinity for a stream, or NaN if no metadata exists.
      * @since 2.28.0
      */
    def duration(): Double = js.native
    
    /**
      * Starts playback of the track and fades it between the specified starting and destination volume levels over
      * the specified number of seconds.
      * @param duration The number of seconds over which the track should be faded.
      * @param toVol The destination volume level.
      * @param fromVol The starting volume level. If omitted, defaults to the track's current volume level.
      * @since 2.28.0
      * @example
      * // Fade the track from volume 0 to 1 over 6 seconds.
      * aTrack.fade(6, 1, 0);
      */
    def fade(duration: Double, toVol: Double): js.Promise[Unit] = js.native
    def fade(duration: Double, toVol: Double, fromVol: Double): js.Promise[Unit] = js.native
    
    /**
      * Starts playback of the track and fades it from the specified volume level to 1 (loudest) over the specified
      * number of seconds.
      * @param duration The number of seconds over which the track should be faded.
      * @param fromVol The starting volume level. If omitted, defaults to the track's current volume level.
      * @since 2.29.0
      * @example
      * // Fade the track in from volume 0 over 5 seconds.
      * aTrack.fadeIn(5, 0);
      */
    def fadeIn(duration: Double): js.Promise[Unit] = js.native
    def fadeIn(duration: Double, fromVol: Double): js.Promise[Unit] = js.native
    
    /**
      * Starts playback of the track and fades it from the specified volume level to 0 (silent) over the specified number
      * of seconds.
      * @param duration The number of seconds over which the track should be faded.
      * @param fromVol The starting volume level. If omitted, defaults to the track's current volume level.
      * @since 2.29.0
      */
    def fadeOut(duration: Double): js.Promise[Unit] = js.native
    def fadeOut(duration: Double, fromVol: Double): js.Promise[Unit] = js.native
    
    /**
      * Interrupts an in-progress fade of the track, or does nothing if no fade is progressing.
      * NOTE: This does not alter the volume level.
      * @since 2.28.0
      */
    def fadeStop(): Unit = js.native
    
    /**
      * Returns whether enough data has been loaded to play the track through to the end without interruption.
      * NOTE: This is an estimate calculated by the browser based upon the currently downloaded data and the download rate.
      * @since 2.28.0
      */
    def hasData(): Boolean = js.native
    
    /**
      * Returns whether, at least, the track's metadata has been loaded.
      * @since 2.28.0
      */
    def hasMetadata(): Boolean = js.native
    
    /**
      * Returns whether none of the track's data has been loaded.
      * @since 2.28.0
      */
    def hasNoData(): Boolean = js.native
    
    /**
      * Returns whether, at least, some of the track's data has been loaded.
      * TIP: The <AudioTrack>.hasData() method is generally more useful.
      * @since 2.28.0
      */
    def hasSomeData(): Boolean = js.native
    
    /**
      * Returns whether any valid sources were registered.
      * @since 2.28.0
      */
    def hasSource(): Boolean = js.native
    
    /**
      * Returns whether playback of the track has ended.
      * @since 2.28.0
      */
    def isEnded(): Boolean = js.native
    
    /**
      * Returns whether a fade is in-progress on the track.
      * @since 2.28.0
      */
    def isFading(): Boolean = js.native
    
    /**
      * Returns whether an error has occurred.
      * @since 2.28.0
      */
    def isFailed(): Boolean = js.native
    
    /**
      * Returns whether the track is loading data.
      * @since 2.28.0
      */
    def isLoading(): Boolean = js.native
    
    /**
      * Returns whether playback of the track has been paused.
      * @since 2.28.0
      */
    def isPaused(): Boolean = js.native
    
    /**
      * Returns whether the track is playing.
      * @since 2.28.0
      */
    def isPlaying(): Boolean = js.native
    
    /**
      * Returns whether the track is seeking.
      * @since 2.28.0
      */
    def isSeeking(): Boolean = js.native
    
    /**
      * Returns whether playback of the track has been stopped.
      * @since 2.29.0
      */
    def isStopped(): Boolean = js.native
    
    /**
      * Returns whether the track is currently unavailable for playback. Possible reasons include: no valid sources are
      * registered, no sources are currently loaded, an error has occurred.
      * @since 2.28.0
      */
    def isUnavailable(): Boolean = js.native
    
    /**
      * Returns whether the track's sources are currently unloaded.
      * @since 2.28.0
      */
    def isUnloaded(): Boolean = js.native
    
    /**
      * Pauses playback of the track and, if it's not already in the process of loading, forces it to drop any existing
      * data and begin loading.
      * WARNING: This should not be done lightly if your audio sources are on the network, as it forces players to begin downloading them.
      * @since 2.28.0
      */
    def load(): Unit = js.native
    
    /**
      * Gets the track's repeating playback state (default: false).
      */
    def loop(): Boolean = js.native
    /**
      * Sets the track's repeating playback state (default: false).
      * @param state The loop state.
      * @returns a reference to the current AudioTrack instance for chaining.
      * @since 2.28.0
      */
    def loop(state: Boolean): this.type = js.native
    
    /**
      * Gets the track's volume mute state (default: false).
      * @since 2.28.0
      */
    def mute(): Boolean = js.native
    /**
      * Sets the track's volume mute state
      * @param state The mute state.
      * @returns a reference to the current AudioTrack instance for chaining.
      * @since 2.28.0
      *
      */
    def mute(state: Boolean): this.type = js.native
    
    /**
      * Removes event handlers from the track. Returns a reference to the current AudioTrack instance for chaining.
      * NOTE: Shorthand for jQuery's .off() method applied to each of the audio elements.
      * WARNING: The SimpleAudio APIs use events internally for various pieces of functionality. To prevent
      * conflicts, it is strongly suggested that you specify a custom user namespace—e.g., .myEvents—when attaching
      * your own handlers. It is further strongly suggested that you provide that same custom user namespace when
      * removing them.
      * @see jQuery.off()
      * @param events One or more space-separated event types and optional namespaces, or just namespaces,
      * such as "click", "keydown.myPlugin", or ".myPlugin".
      * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
      * @param handler A handler function previously attached for the event(s), or the special value false.
      * @example
      * // Remove any handlers for the ended event.
      * someTracks.off('ended.myEvents');
      * @since 2.28.0
      */
    def off(events: String): AudioTrack = js.native
    def off(events: String, selector: String): AudioTrack = js.native
    def off(events: String, selector: String, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def off(events: String, selector: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def off(events: js.Object): AudioTrack = js.native
    def off(events: js.Object, selector: String): AudioTrack = js.native
    def off(events: js.Object, selector: String, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def off(events: js.Object, selector: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def off(events: Event): AudioTrack = js.native
    def off(events: Event, selector: String): AudioTrack = js.native
    def off(events: Event, selector: String, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def off(events: Event, selector: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    
    /**
      * Attaches event handlers to the track. Returns a reference to the current AudioTrack instance for chaining.
      * @param events
      * @param selector
      * @param data
      * @param handler
      * @since 2.28.0
      */
    def on(events: String): AudioTrack = js.native
    def on(events: String, selector: String): AudioTrack = js.native
    def on(events: String, selector: String, data: js.Any): AudioTrack = js.native
    def on(events: String, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: String, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: String, selector: Unit, data: js.Any): AudioTrack = js.native
    def on(events: String, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: String, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: js.Object): AudioTrack = js.native
    def on(events: js.Object, selector: String): AudioTrack = js.native
    def on(events: js.Object, selector: String, data: js.Any): AudioTrack = js.native
    def on(events: js.Object, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: js.Object, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: js.Object, selector: Unit, data: js.Any): AudioTrack = js.native
    def on(events: js.Object, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: js.Object, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: Event): AudioTrack = js.native
    def on(events: Event, selector: String): AudioTrack = js.native
    def on(events: Event, selector: String, data: js.Any): AudioTrack = js.native
    def on(events: Event, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: Event, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: Event, selector: Unit, data: js.Any): AudioTrack = js.native
    def on(events: Event, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def on(events: Event, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    
    /**
      * Attaches single-use event handlers to the track. Returns a reference to the current AudioTrack
      * instance for chaining.
      * @param events
      * @param selector
      * @param data
      * @param handler
      * @since 2.28.0
      */
    def one(events: String): AudioTrack = js.native
    def one(events: String, selector: String): AudioTrack = js.native
    def one(events: String, selector: String, data: js.Any): AudioTrack = js.native
    def one(events: String, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: String, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: String, selector: Unit, data: js.Any): AudioTrack = js.native
    def one(events: String, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: String, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: js.Object): AudioTrack = js.native
    def one(events: js.Object, selector: String): AudioTrack = js.native
    def one(events: js.Object, selector: String, data: js.Any): AudioTrack = js.native
    def one(events: js.Object, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: js.Object, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: js.Object, selector: Unit, data: js.Any): AudioTrack = js.native
    def one(events: js.Object, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: js.Object, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: Event): AudioTrack = js.native
    def one(events: Event, selector: String): AudioTrack = js.native
    def one(events: Event, selector: String, data: js.Any): AudioTrack = js.native
    def one(events: Event, selector: String, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: Event, selector: String, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: Event, selector: Unit, data: js.Any): AudioTrack = js.native
    def one(events: Event, selector: Unit, data: js.Any, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    def one(events: Event, selector: Unit, data: Unit, handler: js.Function1[/* event */ Event, Unit]): AudioTrack = js.native
    
    /**
      * Pauses playback of the track.
      * @since 2.28.0
      */
    def pause(): Unit = js.native
    
    /**
      * Begins playback of the track.
      * @since 2.28.0
      */
    def play(): js.Promise[Unit] = js.native
    
    /**
      * Begins playback of the track or, failing that, sets the track to begin playback as soon as the player has interacted
      * with the document.
      * @since 2.28.0
      */
    def playWhenAllowed(): Unit = js.native
    
    /**
      * Returns how much remains of the track's total playtime in seconds, Infinity for a stream, or NaN if no metadata exists.
      * @since 2.28.0
      */
    def remaining(): Double = js.native
    
    /**
      * Stops playback of the track.
      * @since 2.28.0
      */
    def stop(): Unit = js.native
    
    /**
      * Gets the track's current time in seconds.
      * @since 2.28.0
      */
    def time(): Double = js.native
    /**
      * Sets the track's current time in seconds.
      * @param seconds The time to set. Valid values are floating-point numbers in the range 0 (start) to the maximum
      * duration—e.g., 60 is 60 is sixty seconds in, 90.5 is ninety-point-five seconds in.
      * @since 2.28.0
      */
    def time(seconds: Double): this.type = js.native
    
    /**
      * Stops playback of the track and forces it to drop any existing data.
      * NOTE: Once unloaded, playback cannot occur until the track's data is loaded again.
      * @since 2.28.0
      */
    def unload(): Unit = js.native
    
    /**
      * Gets the track's volume level (default: 1).
      */
    def volume(): Double = js.native
    /**
      * Sets the track's volume level (default: 1).
      * @param level The volume level to set. Valid values are floating-point numbers in the range 0 (silent) to 1 (loudest)
      * — e.g., 0 is 0%, 0.5 is 50%, 1 is 100%.
      * @returns a reference to the current AudioTrack instance for chaining.
      * @since 2.28.0
      */
    def volume(level: Double): this.type = js.native
  }
  
  @js.native
  trait SimpleAudioAPI extends StObject {
    
    val groups: Clear = js.native
    
    val lists: Delete = js.native
    
    /**
      * Pauses playback of all currently registered tracks and, if they're not already in the process of loading, force them to drop any
      * existing data and begin loading.
      * WARNING: This should not be done lightly if your audio sources are on the network, as it forces players to begin downloading them.
      * @since 2.28.0
      */
    def load(): Unit = js.native
    
    /**
      * Displays the loading screen until all currently registered audio tracks have either loaded to a playable state or aborted loading
      * due to errors. The loading process is as described in @see SimpleAudio.load().
      * WARNING: This should not be done lightly if your audio sources are on the network, as it forces players to begin downloading them.
      * @since 2.28.0
      */
    def loadWithScreen(): Unit = js.native
    
    /**
      * Gets or sets the mute state for the master volume (default: false).
      * @since 2.28.0
      */
    def mute(): Boolean = js.native
    def mute(state: Boolean): Unit = js.native
    
    /**
      * Gets or sets the mute-on-hidden state for the master volume (default: false). The mute-on-hidden state controls whether the
      * master volume is automatically muted/unmuted when the story's browser tab loses/gains visibility. Loss of visibility is defined
      * as when the browser window is either switched to another tab or minimized.
      * @since 2.28.0
      */
    def muteOnHidden(): Boolean = js.native
    def muteOnHidden(state: Boolean): Unit = js.native
    
    /**
      * Returns an AudioRunner instance for the tracks matching the given selector.
      * @param selector The list of audio track(s) and/or group ID(s), separated by spaces. There are several predefined group
      * IDs (:all, :looped, :muted, :paused, :playing). The :not() group modifier syntax (groupId:not(selector)) allows a group
      * to have some of its tracks excluded from selection.
      * @since 2.28.0
      * @example
      * // Basic usage
      * SimpleAudio.select(":ui"); // Returns the AudioRunner instance for the tracks matching ":ui"
      * @example
      * // Typical usage
      * // Return the AudioTrack instance matching "swamped" and do something with it
      * SimpleAudio.select("swamped").volume(1).play();
      *
      * // Start playback of paused audio tracks
      * SimpleAudio.select(":paused").play();
      *
      * // Pause playback of playing audio tracks
      * SimpleAudio.select(":playing").pause();
      *
      * // Stop playback of playing audio tracks
      * SimpleAudio.select(":playing").stop();
      *
      * // Stop playback of all audio tracks (not uniquely part of a playlist)
      * SimpleAudio.select(":all").stop();
      *
      * // Stop playback of playing audio tracks except those in the ":ui" group
      * SimpleAudio.select(":playing:not(:ui)").stop();
      *
      * // Change the volume of all audio tracks except those in the ":ui" group
      * // to 40%, without changing the current playback state
      * SimpleAudio.select(":all:not(:ui)").volume(0.40);
      */
    def select(selector: String): AudioRunner | Null = js.native
    
    /**
      * Stops playback of all currently registered tracks.
      * @since 2.28.0
      */
    def stop(): Unit = js.native
    
    val tracks: Add = js.native
    
    /**
      * Stops playback of all currently registered tracks and force them to drop any existing data.
      * NOTE: Once a track has been unloaded, playback cannot occur until it is reloaded.
      * @since 2.28.0
      */
    def unload(): Unit = js.native
    
    /**
      * Gets the master volume level (default: 1).
      */
    def volume(): Double = js.native
    /**
      * Sets the master volume level (default: 1).
      * @param level The volume level to set. Valid values are floating-point numbers in the range 0 (silent) to 1
      * (loudest)—e.g., 0 is 0%, 0.5 is 50%, 1 is 100%.
      * @since 2.28.0
      * @example
      * // Get the current master volume level.
      * var currentMasterVolume = SimpleAudio.volume();
      *
      * // Set the master volume level to 75%.
      * SimpleAudio.volume(0.75);
      */
    def volume(level: Double): Unit = js.native
  }
}
