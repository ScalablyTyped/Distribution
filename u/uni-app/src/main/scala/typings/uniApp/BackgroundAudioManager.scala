package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundAudioManager extends StObject {
  
  /**
    * 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲
    */
  var buffered: js.UndefOr[Double] = js.native
  
  /**
    * 封面图url，用于做原生音频播放器背景图。原生音频播放器中的分享功能，分享出去的卡片配图及背景也将使用该图。
    */
  var coverImgUrl: js.UndefOr[String] = js.native
  
  /**
    * 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回
    */
  var currentTime: js.UndefOr[Double] = js.native
  
  /**
    * 当前音频的长度（单位：s），只有在当前有合法的 src 时返回
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * 专辑名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值
    */
  var epname: js.UndefOr[String] = js.native
  
  /**
    * 背景音频进入可以播放状态，但不保证后面可以流畅播放
    */
  def onCanplay(): Unit = js.native
  def onCanplay(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 背景音频自然播放结束事件
    */
  def onEnded(): Unit = js.native
  def onEnded(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 用户在系统音乐播放面板点击下一曲事件（iOS only）
    */
  def onNext(): Unit = js.native
  def onNext(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 背景音频暂停事件
    */
  def onPause(): Unit = js.native
  def onPause(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 背景音频播放事件
    */
  def onPlay(): Unit = js.native
  def onPlay(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 用户在系统音乐播放面板点击上一曲事件（iOS only）
    */
  def onPrev(): Unit = js.native
  def onPrev(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 背景音频停止事件
    */
  def onStop(): Unit = js.native
  def onStop(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 背景音频播放进度更新事件
    */
  def onTimeUpdate(): Unit = js.native
  def onTimeUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发
    */
  def onWaiting(): Unit = js.native
  def onWaiting(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 暂停
    */
  def pause(): Unit = js.native
  
  /**
    * 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放
    */
  var paused: js.UndefOr[Boolean] = js.native
  
  /**
    * 播放
    */
  def play(): Unit = js.native
  
  /**
    * 音频协议。默认值为 'http'，设置 'hls' 可以支持播放 HLS 协议的直播音频
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): Unit = js.native
  
  /**
    * 歌手名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值
    */
  var singer: js.UndefOr[String] = js.native
  
  /**
    * 音频的数据源，默认为空字符串，当设置了新的 src 时，会自动开始播放 ，目前支持的格式有 m4a, aac, mp3, wav
    */
  var src: js.UndefOr[String] = js.native
  
  /**
    * 音频开始播放的位置（单位：s）
    */
  var startTime: js.UndefOr[Double] = js.native
  
  /**
    * 停止
    */
  def stop(): Unit = js.native
  
  /**
    * 音频标题，用于做原生音频播放器音频标题。原生音频播放器中的分享功能，分享出去的卡片标题，也将使用该值。
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * 页面链接，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值
    */
  var webUrl: js.UndefOr[String] = js.native
}
