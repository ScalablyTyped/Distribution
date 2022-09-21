package typings.wistiaPlayerBrowser

import typings.wistiaPlayerBrowser.anon.After
import typings.wistiaPlayerBrowser.anon.ClickToPlayButton
import typings.wistiaPlayerBrowser.anon.Fov
import typings.wistiaPlayerBrowser.anon.Language
import typings.wistiaPlayerBrowser.anon.MaxHeight
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserBooleans.`false`
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.`mid-roll-email`
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.`post-roll-email`
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.`pre-roll-email`
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.allow
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.auto
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.beforeremove
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.beforereplace
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.betweentimes
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.captionschange
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.conversion
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.crosstime
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.default
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.end
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.flash
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.hd_mp4
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.heightchange
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.lookchange
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.loop
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.metadata
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.mutechange
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.muted
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.none
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.original
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.pause
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.percentwatchedchanged
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.play
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.playbackratechange
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.reset
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.sd_mp4
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.secondchange
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.seek
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.silentplaybackmodechange
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.timechange
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.transparent
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.volumechange
import typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.widthchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WistiaPlayer {
  
  trait Annotation extends StObject {
    
    var duration: Double
    
    var text: String
    
    var time: Double
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Annotation {
    
    inline def apply(duration: Double, text: String, time: Double): Annotation = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Annotation]
    }
    
    extension [Self <: Annotation](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait AnnotationOptions extends StObject {
    
    var links: js.UndefOr[`false` | js.Array[Annotation]] = js.undefined
  }
  object AnnotationOptions {
    
    inline def apply(): AnnotationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationOptions]
    }
    
    extension [Self <: AnnotationOptions](x: Self) {
      
      inline def setLinks(value: `false` | js.Array[Annotation]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: Annotation*): Self = StObject.set(x, "links", js.Array(value*))
    }
  }
  
  type BindCallback = js.Function0[Unit]
  
  trait CaptionOptions extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
    
    var onByDefault: js.UndefOr[Boolean] = js.undefined
    
    var subtitlesScale: js.UndefOr[Double] = js.undefined
  }
  object CaptionOptions {
    
    inline def apply(): CaptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionOptions]
    }
    
    extension [Self <: CaptionOptions](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setOnByDefault(value: Boolean): Self = StObject.set(x, "onByDefault", value.asInstanceOf[js.Any])
      
      inline def setOnByDefaultUndefined: Self = StObject.set(x, "onByDefault", js.undefined)
      
      inline def setSubtitlesScale(value: Double): Self = StObject.set(x, "subtitlesScale", value.asInstanceOf[js.Any])
      
      inline def setSubtitlesScaleUndefined: Self = StObject.set(x, "subtitlesScale", js.undefined)
    }
  }
  
  type CaptionsChangeCallback = js.Function1[/* details */ Language, Unit]
  
  trait Chapter extends StObject {
    
    var time: Double
    
    var title: String
  }
  object Chapter {
    
    inline def apply(time: Double, title: String): Chapter = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chapter]
    }
    
    extension [Self <: Chapter](x: Self) {
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type ConversionCallback = js.Function4[
    /* type */ `pre-roll-email` | `mid-roll-email` | `post-roll-email`, 
    /* email */ String, 
    /* firstName */ String, 
    /* lastName */ String, 
    Unit
  ]
  
  type PercentWatchedCallback = js.Function2[/* percent */ Double, /* lastPercent */ Double, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.beforeplay
    - typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.playing
    - typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.paused
    - typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.ended
  */
  trait PlayState extends StObject
  object PlayState {
    
    inline def beforeplay: typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.beforeplay = "beforeplay".asInstanceOf[typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.beforeplay]
    
    inline def ended: typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.ended = "ended".asInstanceOf[typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.ended]
    
    inline def paused: typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.paused = "paused".asInstanceOf[typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.paused]
    
    inline def playing: typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.playing = "playing".asInstanceOf[typings.wistiaPlayerBrowser.wistiaPlayerBrowserStrings.playing]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`224`
    - typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`360`
    - typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`540`
    - typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`720`
    - typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`1080`
    - typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`3840`
  */
  trait PlaybackQuality extends StObject
  object PlaybackQuality {
    
    inline def `1080`: typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`1080` = 1080.asInstanceOf[typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`1080`]
    
    inline def `224`: typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`224` = 224.asInstanceOf[typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`224`]
    
    inline def `360`: typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`360` = 360.asInstanceOf[typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`360`]
    
    inline def `3840`: typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`3840` = 3840.asInstanceOf[typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`3840`]
    
    inline def `540`: typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`540` = 540.asInstanceOf[typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`540`]
    
    inline def `720`: typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`720` = 720.asInstanceOf[typings.wistiaPlayerBrowser.wistiaPlayerBrowserNumbers.`720`]
  }
  
  type PlaybackRateCallback = js.Function1[/* playbackRate */ Double, Unit]
  
  @js.native
  trait Player extends StObject {
    
    def addToPlaylist(hashId: String): Unit = js.native
    def addToPlaylist(hashId: String, options: Unit, position: After): Unit = js.native
    def addToPlaylist(hashId: String, options: PlayerOptions): Unit = js.native
    def addToPlaylist(hashId: String, options: PlayerOptions, position: After): Unit = js.native
    
    def aspect(): Double = js.native
    
    def bind(
      name: beforeremove | beforereplace | heightchange | widthchange | lookchange | mutechange | play | pause | end,
      callback: BindCallback
    ): Unit = js.native
    @JSName("bind")
    def bind_betweentimes(name: betweentimes, start: Double, end: Double, callback: WithinIntervalCallback): Unit = js.native
    @JSName("bind")
    def bind_captionschange(name: captionschange, callback: CaptionsChangeCallback): Unit = js.native
    @JSName("bind")
    def bind_conversion(name: conversion, callback: ConversionCallback): Unit = js.native
    @JSName("bind")
    def bind_crosstime(name: crosstime, time: Double, callback: BindCallback): Unit = js.native
    @JSName("bind")
    def bind_percentwatchedchanged(name: percentwatchedchanged, callback: PercentWatchedCallback): Unit = js.native
    @JSName("bind")
    def bind_playbackratechange(name: playbackratechange, callback: PlaybackRateCallback): Unit = js.native
    @JSName("bind")
    def bind_secondchange(name: secondchange, callback: SecondChangeCallback): Unit = js.native
    @JSName("bind")
    def bind_seek(name: seek, callback: SeekCallback): Unit = js.native
    @JSName("bind")
    def bind_silentplaybackmodechange(name: silentplaybackmodechange, callback: SilentPlaybackModeCallback): Unit = js.native
    @JSName("bind")
    def bind_timechange(name: timechange, callback: TimeChangeCallback): Unit = js.native
    @JSName("bind")
    def bind_volumechange(name: volumechange, callback: VolumeChangeCallback): Unit = js.native
    
    def duration(): Double = js.native
    
    def email(): String | Null = js.native
    def email(email: String): String | Null = js.native
    
    def embedded(): Boolean = js.native
    
    def eventKey(): String = js.native
    
    def hasData(): Boolean = js.native
    
    def hashedId(): String = js.native
    
    def height(height: Double): Double = js.native
    def height(height: Double, options: VideoDimensionOptions): Double = js.native
    
    def isMuted(): Boolean = js.native
    
    def look(): js.UndefOr[Fov] = js.native
    def look(view: Fov): js.UndefOr[Fov] = js.native
    
    def mute(): Unit = js.native
    
    def name(): String = js.native
    
    def pause(): Unit = js.native
    
    def percentWatched(): Double = js.native
    
    def play(): Unit = js.native
    
    def playbackRate(rate: Double): Unit = js.native
    
    def ready(): Boolean = js.native
    
    def remove(): Unit = js.native
    
    def replaceWith(hashId: String): Unit = js.native
    def replaceWith(hashId: String, options: PlayerOptions): Unit = js.native
    
    def secondsWatched(): Double = js.native
    
    def secondsWatchedVector(): js.Array[Double] = js.native
    
    def state(): PlayState = js.native
    
    def time(): Double = js.native
    def time(time: Double): Double = js.native
    
    def unbind(name: heightchange | lookchange | mutechange | play | pause | end, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_captionschange(name: captionschange, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_captionschange(name: captionschange, callback: CaptionsChangeCallback): Unit = js.native
    @JSName("unbind")
    def unbind_conversion(name: conversion, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_conversion(name: conversion, callback: ConversionCallback): Unit = js.native
    @JSName("unbind")
    def unbind_crosstime(name: crosstime, time: Double, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_percentwatchedchanged(name: percentwatchedchanged, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_percentwatchedchanged(name: percentwatchedchanged, callback: PercentWatchedCallback): Unit = js.native
    @JSName("unbind")
    def unbind_playbackratechange(name: playbackratechange, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_playbackratechange(name: playbackratechange, callback: PlaybackRateCallback): Unit = js.native
    @JSName("unbind")
    def unbind_secondchange(name: secondchange, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_secondchange(name: secondchange, callback: SecondChangeCallback): Unit = js.native
    @JSName("unbind")
    def unbind_seek(name: seek, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_seek(name: seek, callback: SeekCallback): Unit = js.native
    @JSName("unbind")
    def unbind_silentplaybackmodechange(name: silentplaybackmodechange, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_silentplaybackmodechange(name: silentplaybackmodechange, callback: SilentPlaybackModeCallback): Unit = js.native
    @JSName("unbind")
    def unbind_timechange(name: timechange, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_timechange(name: timechange, callback: TimeChangeCallback): Unit = js.native
    @JSName("unbind")
    def unbind_volumechange(name: volumechange, callback: BindCallback): Unit = js.native
    @JSName("unbind")
    def unbind_volumechange(name: volumechange, callback: VolumeChangeCallback): Unit = js.native
    @JSName("unbind")
    def unbind_widthchange(name: widthchange, callback: BindCallback): Unit = js.native
    
    def unmute(): Unit = js.native
    
    def videoHeight(height: Double): Double = js.native
    def videoHeight(height: Double, options: VideoDimensionOptions): Double = js.native
    
    def videoWidth(width: Double): Double = js.native
    def videoWidth(width: Double, options: VideoDimensionOptions): Double = js.native
    
    def visitorKey(): String = js.native
    
    def volume(volume: Double): Double = js.native
    
    def width(width: Double): Double = js.native
    def width(width: Double, options: VideoDimensionOptions): Double = js.native
  }
  
  trait PlayerOptions extends StObject {
    
    var autoPlay: js.UndefOr[Boolean | muted] = js.undefined
    
    var chapterList: js.UndefOr[js.Array[Chapter]] = js.undefined
    
    var chaptersOn: js.UndefOr[Boolean] = js.undefined
    
    var controlsVisibleOnLoad: js.UndefOr[Boolean] = js.undefined
    
    var copyLinkAndThumbnailEnabled: js.UndefOr[Boolean] = js.undefined
    
    var doNotTrack: js.UndefOr[Boolean] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var endVideoBehavior: js.UndefOr[default | reset | loop] = js.undefined
    
    var fakeFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var fullscreenButton: js.UndefOr[Boolean] = js.undefined
    
    var fullscreenOnRotateToLandscape: js.UndefOr[Boolean] = js.undefined
    
    var googleAnalytics: js.UndefOr[Boolean] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var playButton: js.UndefOr[Boolean] = js.undefined
    
    var playSuspendedOffScreen: js.UndefOr[Boolean] = js.undefined
    
    var playbackRateControl: js.UndefOr[Boolean] = js.undefined
    
    var playbar: js.UndefOr[Boolean] = js.undefined
    
    var playerColor: js.UndefOr[String] = js.undefined
    
    var playlistLinks: js.UndefOr[String] = js.undefined
    
    var playlistLoop: js.UndefOr[String] = js.undefined
    
    var playsinline: js.UndefOr[Boolean] = js.undefined
    
    var plugin: js.UndefOr[PluginOptions] = js.undefined
    
    var preload: js.UndefOr[Boolean | metadata | auto | none] = js.undefined
    
    var qualityControl: js.UndefOr[Boolean] = js.undefined
    
    var qualityMax: js.UndefOr[PlaybackQuality] = js.undefined
    
    var qualityMin: js.UndefOr[PlaybackQuality] = js.undefined
    
    var resumable: js.UndefOr[Boolean | auto] = js.undefined
    
    var seo: js.UndefOr[Boolean] = js.undefined
    
    var settingsControl: js.UndefOr[Boolean] = js.undefined
    
    var silentAutoPlay: js.UndefOr[Boolean | allow] = js.undefined
    
    var smallPlayButton: js.UndefOr[Boolean] = js.undefined
    
    var stillUrl: js.UndefOr[String] = js.undefined
    
    var time: js.UndefOr[String] = js.undefined
    
    var videoFoam: js.UndefOr[Boolean | MaxHeight] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
    
    var volumeControl: js.UndefOr[Boolean] = js.undefined
    
    var wmode: js.UndefOr[transparent | flash] = js.undefined
  }
  object PlayerOptions {
    
    inline def apply(): PlayerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayerOptions]
    }
    
    extension [Self <: PlayerOptions](x: Self) {
      
      inline def setAutoPlay(value: Boolean | muted): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setChapterList(value: js.Array[Chapter]): Self = StObject.set(x, "chapterList", value.asInstanceOf[js.Any])
      
      inline def setChapterListUndefined: Self = StObject.set(x, "chapterList", js.undefined)
      
      inline def setChapterListVarargs(value: Chapter*): Self = StObject.set(x, "chapterList", js.Array(value*))
      
      inline def setChaptersOn(value: Boolean): Self = StObject.set(x, "chaptersOn", value.asInstanceOf[js.Any])
      
      inline def setChaptersOnUndefined: Self = StObject.set(x, "chaptersOn", js.undefined)
      
      inline def setControlsVisibleOnLoad(value: Boolean): Self = StObject.set(x, "controlsVisibleOnLoad", value.asInstanceOf[js.Any])
      
      inline def setControlsVisibleOnLoadUndefined: Self = StObject.set(x, "controlsVisibleOnLoad", js.undefined)
      
      inline def setCopyLinkAndThumbnailEnabled(value: Boolean): Self = StObject.set(x, "copyLinkAndThumbnailEnabled", value.asInstanceOf[js.Any])
      
      inline def setCopyLinkAndThumbnailEnabledUndefined: Self = StObject.set(x, "copyLinkAndThumbnailEnabled", js.undefined)
      
      inline def setDoNotTrack(value: Boolean): Self = StObject.set(x, "doNotTrack", value.asInstanceOf[js.Any])
      
      inline def setDoNotTrackUndefined: Self = StObject.set(x, "doNotTrack", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEndVideoBehavior(value: default | reset | loop): Self = StObject.set(x, "endVideoBehavior", value.asInstanceOf[js.Any])
      
      inline def setEndVideoBehaviorUndefined: Self = StObject.set(x, "endVideoBehavior", js.undefined)
      
      inline def setFakeFullscreen(value: Boolean): Self = StObject.set(x, "fakeFullscreen", value.asInstanceOf[js.Any])
      
      inline def setFakeFullscreenUndefined: Self = StObject.set(x, "fakeFullscreen", js.undefined)
      
      inline def setFullscreenButton(value: Boolean): Self = StObject.set(x, "fullscreenButton", value.asInstanceOf[js.Any])
      
      inline def setFullscreenButtonUndefined: Self = StObject.set(x, "fullscreenButton", js.undefined)
      
      inline def setFullscreenOnRotateToLandscape(value: Boolean): Self = StObject.set(x, "fullscreenOnRotateToLandscape", value.asInstanceOf[js.Any])
      
      inline def setFullscreenOnRotateToLandscapeUndefined: Self = StObject.set(x, "fullscreenOnRotateToLandscape", js.undefined)
      
      inline def setGoogleAnalytics(value: Boolean): Self = StObject.set(x, "googleAnalytics", value.asInstanceOf[js.Any])
      
      inline def setGoogleAnalyticsUndefined: Self = StObject.set(x, "googleAnalytics", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setPlayButton(value: Boolean): Self = StObject.set(x, "playButton", value.asInstanceOf[js.Any])
      
      inline def setPlayButtonUndefined: Self = StObject.set(x, "playButton", js.undefined)
      
      inline def setPlaySuspendedOffScreen(value: Boolean): Self = StObject.set(x, "playSuspendedOffScreen", value.asInstanceOf[js.Any])
      
      inline def setPlaySuspendedOffScreenUndefined: Self = StObject.set(x, "playSuspendedOffScreen", js.undefined)
      
      inline def setPlaybackRateControl(value: Boolean): Self = StObject.set(x, "playbackRateControl", value.asInstanceOf[js.Any])
      
      inline def setPlaybackRateControlUndefined: Self = StObject.set(x, "playbackRateControl", js.undefined)
      
      inline def setPlaybar(value: Boolean): Self = StObject.set(x, "playbar", value.asInstanceOf[js.Any])
      
      inline def setPlaybarUndefined: Self = StObject.set(x, "playbar", js.undefined)
      
      inline def setPlayerColor(value: String): Self = StObject.set(x, "playerColor", value.asInstanceOf[js.Any])
      
      inline def setPlayerColorUndefined: Self = StObject.set(x, "playerColor", js.undefined)
      
      inline def setPlaylistLinks(value: String): Self = StObject.set(x, "playlistLinks", value.asInstanceOf[js.Any])
      
      inline def setPlaylistLinksUndefined: Self = StObject.set(x, "playlistLinks", js.undefined)
      
      inline def setPlaylistLoop(value: String): Self = StObject.set(x, "playlistLoop", value.asInstanceOf[js.Any])
      
      inline def setPlaylistLoopUndefined: Self = StObject.set(x, "playlistLoop", js.undefined)
      
      inline def setPlaysinline(value: Boolean): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
      
      inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
      
      inline def setPlugin(value: PluginOptions): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setPreload(value: Boolean | metadata | auto | none): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setQualityControl(value: Boolean): Self = StObject.set(x, "qualityControl", value.asInstanceOf[js.Any])
      
      inline def setQualityControlUndefined: Self = StObject.set(x, "qualityControl", js.undefined)
      
      inline def setQualityMax(value: PlaybackQuality): Self = StObject.set(x, "qualityMax", value.asInstanceOf[js.Any])
      
      inline def setQualityMaxUndefined: Self = StObject.set(x, "qualityMax", js.undefined)
      
      inline def setQualityMin(value: PlaybackQuality): Self = StObject.set(x, "qualityMin", value.asInstanceOf[js.Any])
      
      inline def setQualityMinUndefined: Self = StObject.set(x, "qualityMin", js.undefined)
      
      inline def setResumable(value: Boolean | auto): Self = StObject.set(x, "resumable", value.asInstanceOf[js.Any])
      
      inline def setResumableUndefined: Self = StObject.set(x, "resumable", js.undefined)
      
      inline def setSeo(value: Boolean): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
      
      inline def setSeoUndefined: Self = StObject.set(x, "seo", js.undefined)
      
      inline def setSettingsControl(value: Boolean): Self = StObject.set(x, "settingsControl", value.asInstanceOf[js.Any])
      
      inline def setSettingsControlUndefined: Self = StObject.set(x, "settingsControl", js.undefined)
      
      inline def setSilentAutoPlay(value: Boolean | allow): Self = StObject.set(x, "silentAutoPlay", value.asInstanceOf[js.Any])
      
      inline def setSilentAutoPlayUndefined: Self = StObject.set(x, "silentAutoPlay", js.undefined)
      
      inline def setSmallPlayButton(value: Boolean): Self = StObject.set(x, "smallPlayButton", value.asInstanceOf[js.Any])
      
      inline def setSmallPlayButtonUndefined: Self = StObject.set(x, "smallPlayButton", js.undefined)
      
      inline def setStillUrl(value: String): Self = StObject.set(x, "stillUrl", value.asInstanceOf[js.Any])
      
      inline def setStillUrlUndefined: Self = StObject.set(x, "stillUrl", js.undefined)
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setVideoFoam(value: Boolean | MaxHeight): Self = StObject.set(x, "videoFoam", value.asInstanceOf[js.Any])
      
      inline def setVideoFoamUndefined: Self = StObject.set(x, "videoFoam", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeControl(value: Boolean): Self = StObject.set(x, "volumeControl", value.asInstanceOf[js.Any])
      
      inline def setVolumeControlUndefined: Self = StObject.set(x, "volumeControl", js.undefined)
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
      
      inline def setWmode(value: transparent | flash): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
    }
  }
  
  trait PluginOptions extends StObject {
    
    var `captions-v1`: js.UndefOr[CaptionOptions] = js.undefined
    
    var `midrollLink-v1`: js.UndefOr[AnnotationOptions] = js.undefined
    
    var `postRoll-v1`: js.UndefOr[PostRollOptions] = js.undefined
    
    @JSName("requireEmail-v1?")
    var `requireEmail-v1Questionmark`: js.UndefOr[TurnStyleOptions] = js.undefined
    
    var share: js.UndefOr[ShareOptions] = js.undefined
    
    var videoThumbnail: js.UndefOr[ClickToPlayButton] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def `setCaptions-v1`(value: CaptionOptions): Self = StObject.set(x, "captions-v1", value.asInstanceOf[js.Any])
      
      inline def `setCaptions-v1Undefined`: Self = StObject.set(x, "captions-v1", js.undefined)
      
      inline def `setMidrollLink-v1`(value: AnnotationOptions): Self = StObject.set(x, "midrollLink-v1", value.asInstanceOf[js.Any])
      
      inline def `setMidrollLink-v1Undefined`: Self = StObject.set(x, "midrollLink-v1", js.undefined)
      
      inline def `setPostRoll-v1`(value: PostRollOptions): Self = StObject.set(x, "postRoll-v1", value.asInstanceOf[js.Any])
      
      inline def `setPostRoll-v1Undefined`: Self = StObject.set(x, "postRoll-v1", js.undefined)
      
      inline def `setRequireEmail-v1Questionmark`(value: TurnStyleOptions): Self = StObject.set(x, "requireEmail-v1?", value.asInstanceOf[js.Any])
      
      inline def `setRequireEmail-v1QuestionmarkUndefined`: Self = StObject.set(x, "requireEmail-v1?", js.undefined)
      
      inline def setShare(value: ShareOptions): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
      
      inline def setShareUndefined: Self = StObject.set(x, "share", js.undefined)
      
      inline def setVideoThumbnail(value: ClickToPlayButton): Self = StObject.set(x, "videoThumbnail", value.asInstanceOf[js.Any])
      
      inline def setVideoThumbnailUndefined: Self = StObject.set(x, "videoThumbnail", js.undefined)
    }
  }
  
  trait PostRollOptions extends StObject {
    
    var autoSize: js.UndefOr[Boolean] = js.undefined
    
    var backgroundOpacity: js.UndefOr[Double] = js.undefined
    
    var image: js.UndefOr[Double] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var on: js.UndefOr[Boolean] = js.undefined
    
    var raw: js.UndefOr[String] = js.undefined
    
    var rewatch: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var time: js.UndefOr[Double] = js.undefined
  }
  object PostRollOptions {
    
    inline def apply(): PostRollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostRollOptions]
    }
    
    extension [Self <: PostRollOptions](x: Self) {
      
      inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setBackgroundOpacity(value: Double): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOpacityUndefined: Self = StObject.set(x, "backgroundOpacity", js.undefined)
      
      inline def setImage(value: Double): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRewatch(value: Boolean): Self = StObject.set(x, "rewatch", value.asInstanceOf[js.Any])
      
      inline def setRewatchUndefined: Self = StObject.set(x, "rewatch", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  type SecondChangeCallback = js.Function1[/* time */ Double, Unit]
  
  type SeekCallback = js.Function2[/* currentTime */ Double, /* lastTime */ Double, Unit]
  
  trait ShareOptions extends StObject {
    
    var channels: js.UndefOr[String] = js.undefined
    
    var downloadType: js.UndefOr[sd_mp4 | hd_mp4 | original] = js.undefined
    
    var overrideUrl: js.UndefOr[Boolean] = js.undefined
    
    var pageTitle: js.UndefOr[String] = js.undefined
    
    var pageUrl: js.UndefOr[String] = js.undefined
    
    var tweetText: js.UndefOr[String] = js.undefined
  }
  object ShareOptions {
    
    inline def apply(): ShareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShareOptions]
    }
    
    extension [Self <: ShareOptions](x: Self) {
      
      inline def setChannels(value: String): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setDownloadType(value: sd_mp4 | hd_mp4 | original): Self = StObject.set(x, "downloadType", value.asInstanceOf[js.Any])
      
      inline def setDownloadTypeUndefined: Self = StObject.set(x, "downloadType", js.undefined)
      
      inline def setOverrideUrl(value: Boolean): Self = StObject.set(x, "overrideUrl", value.asInstanceOf[js.Any])
      
      inline def setOverrideUrlUndefined: Self = StObject.set(x, "overrideUrl", js.undefined)
      
      inline def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
      
      inline def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
      
      inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      inline def setTweetText(value: String): Self = StObject.set(x, "tweetText", value.asInstanceOf[js.Any])
      
      inline def setTweetTextUndefined: Self = StObject.set(x, "tweetText", js.undefined)
    }
  }
  
  type SilentPlaybackModeCallback = js.Function1[/* isSilentPlaybackMode */ Boolean, Unit]
  
  type TimeChangeCallback = js.Function1[/* time */ Double, Unit]
  
  trait TurnStyleOptions extends StObject {
    
    var allowSkip: js.UndefOr[Boolean] = js.undefined
    
    var alwaysShow: js.UndefOr[Boolean] = js.undefined
    
    var askName: js.UndefOr[Boolean] = js.undefined
    
    var bottomText: js.UndefOr[String] = js.undefined
    
    var buttonBackground: js.UndefOr[String] = js.undefined
    
    var emailExampleText: js.UndefOr[String] = js.undefined
    
    var errorColor: js.UndefOr[String] = js.undefined
    
    var firstNameExampleText: js.UndefOr[String] = js.undefined
    
    var invalidDomains: js.UndefOr[String] = js.undefined
    
    var lastNameExampleText: js.UndefOr[String] = js.undefined
    
    var sectionIndex: js.UndefOr[Double] = js.undefined
    
    var time: js.UndefOr[Double] = js.undefined
    
    var topText: js.UndefOr[String] = js.undefined
    
    var validDomains: js.UndefOr[String] = js.undefined
    
    var videoIndex: js.UndefOr[Double] = js.undefined
  }
  object TurnStyleOptions {
    
    inline def apply(): TurnStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TurnStyleOptions]
    }
    
    extension [Self <: TurnStyleOptions](x: Self) {
      
      inline def setAllowSkip(value: Boolean): Self = StObject.set(x, "allowSkip", value.asInstanceOf[js.Any])
      
      inline def setAllowSkipUndefined: Self = StObject.set(x, "allowSkip", js.undefined)
      
      inline def setAlwaysShow(value: Boolean): Self = StObject.set(x, "alwaysShow", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowUndefined: Self = StObject.set(x, "alwaysShow", js.undefined)
      
      inline def setAskName(value: Boolean): Self = StObject.set(x, "askName", value.asInstanceOf[js.Any])
      
      inline def setAskNameUndefined: Self = StObject.set(x, "askName", js.undefined)
      
      inline def setBottomText(value: String): Self = StObject.set(x, "bottomText", value.asInstanceOf[js.Any])
      
      inline def setBottomTextUndefined: Self = StObject.set(x, "bottomText", js.undefined)
      
      inline def setButtonBackground(value: String): Self = StObject.set(x, "buttonBackground", value.asInstanceOf[js.Any])
      
      inline def setButtonBackgroundUndefined: Self = StObject.set(x, "buttonBackground", js.undefined)
      
      inline def setEmailExampleText(value: String): Self = StObject.set(x, "emailExampleText", value.asInstanceOf[js.Any])
      
      inline def setEmailExampleTextUndefined: Self = StObject.set(x, "emailExampleText", js.undefined)
      
      inline def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setFirstNameExampleText(value: String): Self = StObject.set(x, "firstNameExampleText", value.asInstanceOf[js.Any])
      
      inline def setFirstNameExampleTextUndefined: Self = StObject.set(x, "firstNameExampleText", js.undefined)
      
      inline def setInvalidDomains(value: String): Self = StObject.set(x, "invalidDomains", value.asInstanceOf[js.Any])
      
      inline def setInvalidDomainsUndefined: Self = StObject.set(x, "invalidDomains", js.undefined)
      
      inline def setLastNameExampleText(value: String): Self = StObject.set(x, "lastNameExampleText", value.asInstanceOf[js.Any])
      
      inline def setLastNameExampleTextUndefined: Self = StObject.set(x, "lastNameExampleText", js.undefined)
      
      inline def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
      
      inline def setSectionIndexUndefined: Self = StObject.set(x, "sectionIndex", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setTopText(value: String): Self = StObject.set(x, "topText", value.asInstanceOf[js.Any])
      
      inline def setTopTextUndefined: Self = StObject.set(x, "topText", js.undefined)
      
      inline def setValidDomains(value: String): Self = StObject.set(x, "validDomains", value.asInstanceOf[js.Any])
      
      inline def setValidDomainsUndefined: Self = StObject.set(x, "validDomains", js.undefined)
      
      inline def setVideoIndex(value: Double): Self = StObject.set(x, "videoIndex", value.asInstanceOf[js.Any])
      
      inline def setVideoIndexUndefined: Self = StObject.set(x, "videoIndex", js.undefined)
    }
  }
  
  trait VideoDimensionOptions extends StObject {
    
    var constrain: Boolean
  }
  object VideoDimensionOptions {
    
    inline def apply(constrain: Boolean): VideoDimensionOptions = {
      val __obj = js.Dynamic.literal(constrain = constrain.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoDimensionOptions]
    }
    
    extension [Self <: VideoDimensionOptions](x: Self) {
      
      inline def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    }
  }
  
  type VolumeChangeCallback = js.Function1[/* volume */ Double, Unit]
  
  type WithinIntervalCallback = js.Function1[/* withinInterval */ Boolean, Unit]
}
