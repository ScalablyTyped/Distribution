package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofiOS extends js.Object {
  /**
  			 * Allow the navigation to continue.
  			 */
  val ACTION_POLICY_ALLOW: scala.Double = js.native
  /**
  			 * Cancel the navigation.
  			 */
  val ACTION_POLICY_CANCEL: scala.Double = js.native
  /**
  			 * Use with [AdView.adSize](Titanium.UI.iOS.AdView.adSize) to specify a banner ad size
  			 * appropriate for landscape orientations.
  			 */
  val AD_SIZE_LANDSCAPE: java.lang.String = js.native
  /**
  			 * Use with [AdView.adSize](Titanium.UI.iOS.AdView.adSize) to specify a banner ad size
  			 * appropriate for portrait orientations.
  			 */
  val AD_SIZE_PORTRAIT: java.lang.String = js.native
  /**
  			 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
  			 * slowly and speeds up.
  			 */
  val ANIMATION_CURVE_EASE_IN: scala.Double = js.native
  /**
  			 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
  			 * slowly, and speeds up, then slows down at the end of the animation.
  			 */
  val ANIMATION_CURVE_EASE_IN_OUT: scala.Double = js.native
  /**
  			 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that starts
  			 * quickly, then slows down at the end of the animation.
  			 */
  val ANIMATION_CURVE_EASE_OUT: scala.Double = js.native
  /**
  			 * Use with [Animation.curve](Titanium.UI.Animation.curve) to specify an animation that proceeds
  			 * at a constant rate.
  			 */
  val ANIMATION_CURVE_LINEAR: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to specify a background color.
  			 */
  val ATTRIBUTE_BACKGROUND_COLOR: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to apply a different baseline to the text.
  			 */
  val ATTRIBUTE_BASELINE_OFFSET: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to stretch the text horizontally.
  			 */
  val ATTRIBUTE_EXPANSION: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to specify a font.
  			 */
  val ATTRIBUTE_FONT: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to specify a font color.
  			 */
  val ATTRIBUTE_FOREGROUND_COLOR: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to specify kerning (space between characters).
  			 */
  val ATTRIBUTE_KERN: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to use a letterpress text effect.
  			 */
  val ATTRIBUTE_LETTERPRESS_STYLE: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to enable or disable ligatures.
  			 */
  val ATTRIBUTE_LIGATURE: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to create a link.
  			 */
  val ATTRIBUTE_LINK: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to skew the text.
  			 */
  val ATTRIBUTE_OBLIQUENESS: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to display a shadow behind the text.
  			 */
  val ATTRIBUTE_SHADOW: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to change the color of the horizontal line.
  			 */
  val ATTRIBUTE_STRIKETHROUGH_COLOR: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to place a horizontal line through the text.
  			 */
  val ATTRIBUTE_STRIKETHROUGH_STYLE: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to specify a color for the stroke text.
  			 */
  val ATTRIBUTE_STROKE_COLOR: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to specify the width of the stroke text.
  			 */
  val ATTRIBUTE_STROKE_WIDTH: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to apply a text effect.
  			 */
  val ATTRIBUTE_TEXT_EFFECT: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to place a horizontal line under the text.
  			 */
  val ATTRIBUTE_UNDERLINES_STYLE: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to draw a line only underneath or through words.
  			 */
  val ATTRIBUTE_UNDERLINE_BY_WORD: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to change the color of the horizontal line.
  			 */
  val ATTRIBUTE_UNDERLINE_COLOR: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to draw a dashed line.
  			 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to draw an alternating line of dashes and dots.
  			 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to draw an alternating line of dashes and two dots.
  			 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DASH_DOT_DOT: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to draw a dotted line.
  			 */
  val ATTRIBUTE_UNDERLINE_PATTERN_DOT: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to draw a solid line.
  			 */
  val ATTRIBUTE_UNDERLINE_PATTERN_SOLID: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to draw a double line.
  			 */
  val ATTRIBUTE_UNDERLINE_STYLE_DOUBLE: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to not draw a line.
  			 */
  val ATTRIBUTE_UNDERLINE_STYLE_NONE: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to draw a single line.
  			 */
  val ATTRIBUTE_UNDERLINE_STYLE_SINGLE: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to draw a thick line.
  			 */
  val ATTRIBUTE_UNDERLINE_STYLE_THICK: scala.Double = js.native
  /**
  			 * Use with <Attribute.type> to control the direction of the text.
  			 */
  val ATTRIBUTE_WRITING_DIRECTION: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to use the embedded text direction.
  			 */
  val ATTRIBUTE_WRITING_DIRECTION_EMBEDDING: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to write text left to right.
  			 */
  val ATTRIBUTE_WRITING_DIRECTION_LEFT_TO_RIGHT: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to use the
  			 * [Unicode Bidirection Algorithm rules P2 and P3](http://www.unicode.org/reports/tr9/#The_Paragraph_Level)
  			 * to determine which direction to use.
  			 */
  val ATTRIBUTE_WRITING_DIRECTION_NATURAL: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to override the text direction.
  			 */
  val ATTRIBUTE_WRITING_DIRECTION_OVERRIDE: scala.Double = js.native
  /**
  			 * Use with <Attribute.value> to write text right to left.
  			 */
  val ATTRIBUTE_WRITING_DIRECTION_RIGHT_TO_LEFT: scala.Double = js.native
  /**
  			 * All media types require a user gesture to begin playing.
  			 */
  val AUDIOVISUAL_MEDIA_TYPE_ALL: scala.Double = js.native
  /**
  			 * Media types containing audio require a user gesture to begin playing.
  			 */
  val AUDIOVISUAL_MEDIA_TYPE_AUDIO: scala.Double = js.native
  /**
  			 * No media types require a user gesture to begin playing.
  			 */
  val AUDIOVISUAL_MEDIA_TYPE_NONE: scala.Double = js.native
  /**
  			 * Media types containing video require a user gesture to begin playing.
  			 */
  val AUDIOVISUAL_MEDIA_TYPE_VIDEO: scala.Double = js.native
  /**
  			 * Converts strings formatted as addresses into clickable links.
  			 */
  val AUTODETECT_ADDRESS: scala.Double = js.native
  /**
  			 * Converts all detectable types of data into clickable links.
  			 */
  val AUTODETECT_ALL: scala.Double = js.native
  /**
  			 * Converts strings formatted as calendar events into clickable links.
  			 */
  val AUTODETECT_CALENDAR: scala.Double = js.native
  /**
  			 * Converts strings formatted as URLs into clickable links.
  			 */
  val AUTODETECT_LINK: scala.Double = js.native
  /**
  			 * Disables converting strings into clickable links.
  			 */
  val AUTODETECT_NONE: scala.Double = js.native
  /**
  			 * Converts strings formatted as phone numbers into clickable links.
  			 */
  val AUTODETECT_PHONE: scala.Double = js.native
  /**
  			 * A set of constants for the style that can be used for the `style` property of
  			 * <Titanium.UI.AlertDialog>.
  			 */
  val AlertDialogStyleNs: TypeofAlertDialogStyle = js.native
  /**
  			 * A set of constants for the animation styles used for view transitions.
  			 * One of the group of animation style constants
  			 *   * [CURL_DOWN](Titanium.UI.iOS.AnimationStyle.CURL_DOWN)
  			 *   * [CURL_UP](Titanium.UI.iOS.AnimationStyle.CURL_UP)
  			 *   * [FLIP_FROM_LEFT](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_LEFT)
  			 *   * [FLIP_FROM_RIGHT](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_RIGHT)
  			 *   * [FLIP_FROM_TOP](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_TOP)
  			 *   * [FLIP_FROM_BOTTOM](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_BOTTOM)
  			 *   * [CROSS_DISSOLVE](Titanium.UI.iOS.AnimationStyle.CROSS_DISSOLVE)
  			 *   * [NONE](Titanium.UI.iOS.AnimationStyle.NONE)
  			 */
  val AnimationStyleNs: TypeofAnimationStyle = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_CLEAR: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_COLOR: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_COLOR_BURN: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_COLOR_DODGE: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_COPY: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_DARKEN: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_DESTINATION_ATOP: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_DESTINATION_IN: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_DESTINATION_OUT: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_DESTINATION_OVER: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_DIFFERENCE: scala.Double = js.native
  /**
  			 * Image mode constant. Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_EXCLUSION: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_HARD_LIGHT: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_HUE: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_LIGHTEN: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_LUMINOSITY: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_MULTIPLY: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_NORMAL: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_OVERLAY: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_PLUS_DARKER: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_PLUS_LIGHTER: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_SATURATION: scala.Double = js.native
  /**
  			 * Image mode constant. Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_SCREEN: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_SOFT_LIGHT: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_SOURCE_ATOP: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_SOURCE_IN: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_SOURCE_OUT: scala.Double = js.native
  /**
  			 * Use with [MaskedImage.mode](Titanium.UI.MaskedImage.mode) to specify a blend mode.
  			 */
  val BLEND_MODE_XOR: scala.Double = js.native
  /**
  			 * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
  			 */
  val BLUR_EFFECT_STYLE_DARK: scala.Double = js.native
  /**
  			 * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
  			 */
  val BLUR_EFFECT_STYLE_EXTRA_LIGHT: scala.Double = js.native
  /**
  			 * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
  			 */
  val BLUR_EFFECT_STYLE_LIGHT: scala.Double = js.native
  /**
  			 * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
  			 */
  val BLUR_EFFECT_STYLE_PROMINENT: scala.Double = js.native
  /**
  			 * Use with [BlurView.effect](Titanium.UI.iOS.BlurView.effect) to specify a blur effect.
  			 */
  val BLUR_EFFECT_STYLE_REGULAR: scala.Double = js.native
  /**
  			 * Specifies that the data for the URL load should be loaded from the originating source.
  			 * No existing cache data should be used to satisfy a URL load request.
  			 */
  val CACHE_POLICY_RELOAD_IGNORING_LOCAL_CACHE_DATA: scala.Double = js.native
  /**
  			 * Specifies that the existing cache data should be used to satisfy a request,
  			 * regardless of its age or expiration date.
  			 */
  val CACHE_POLICY_RETURN_CACHE_DATA_DONT_LOAD: scala.Double = js.native
  /**
  			 * Specifies that the existing cached data should be used to satisfy the request,
  			 * regardless of its age or expiration date.
  			 */
  val CACHE_POLICY_RETURN_CACHE_DATA_ELSE_LOAD: scala.Double = js.native
  /**
  			 * Specifies that the caching logic defined in the protocol implementation, if any,
  			 * is used for a particular URL load request.
  			 */
  val CACHE_POLICY_USE_PROTOCOL_CACHE_POLICY: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.View.clipMode> to specify clipping behavior.
  			 */
  val CLIP_MODE_DEFAULT: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.View.clipMode> to specify clipping behavior.
  			 */
  val CLIP_MODE_DISABLED: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.View.clipMode> to specify clipping behavior.
  			 */
  val CLIP_MODE_ENABLED: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.iOS.CollisionBehavior.collisionMode> to specify collisions with both items and
  			 * boundaries.
  			 */
  val COLLISION_MODE_ALL: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.iOS.CollisionBehavior.collisionMode> to specify collisions with
  			 * boundaries only.
  			 */
  val COLLISION_MODE_BOUNDARY: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.iOS.CollisionBehavior.collisionMode> to specify collisions with items only.
  			 */
  val COLLISION_MODE_ITEM: scala.Double = js.native
  /**
  			 * Credential should be stored only for this session.
  			 */
  val CREDENTIAL_PERSISTENCE_FOR_SESSION: scala.Double = js.native
  /**
  			 * Credential should not be stored.
  			 */
  val CREDENTIAL_PERSISTENCE_NONE: scala.Double = js.native
  /**
  			 * Credential should be stored in the keychain.
  			 */
  val CREDENTIAL_PERSISTENCE_PERMANENT: scala.Double = js.native
  /**
  			 * Credential should be stored permanently in the keychain, and in addition should be
  			 * distributed to other devices based on the owning AppleID.
  			 */
  val CREDENTIAL_PERSISTENCE_SYNCHRONIZABLE: scala.Double = js.native
  /**
  			 * The heavy impact style used as the `style` argument when creating a <Titanium.UI.iOS.FeedbackGenerator> with the
  			 * type <Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT>.
  			 */
  val FEEDBACK_GENERATOR_IMPACT_STYLE_HEAVY: scala.Double = js.native
  /**
  			 * The light impact style used as the `style` argument when creating a <Titanium.UI.iOS.FeedbackGenerator> with the
  			 * type <Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT>.
  			 */
  val FEEDBACK_GENERATOR_IMPACT_STYLE_LIGHT: scala.Double = js.native
  /**
  			 * The medium impact style used as the `style` argument when creating a <Titanium.UI.iOS.FeedbackGenerator> with the
  			 * type <Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT>.
  			 */
  val FEEDBACK_GENERATOR_IMPACT_STYLE_MEDIUM: scala.Double = js.native
  /**
  			 * The error notification type used as the argument in <Titanium.UI.iOS.FeedbackGenerator.notificationOccurred>.
  			 */
  val FEEDBACK_GENERATOR_NOTIFICATION_TYPE_ERROR: scala.Double = js.native
  /**
  			 * The success notification type used as the argument in <Titanium.UI.iOS.FeedbackGenerator.notificationOccurred>.
  			 */
  val FEEDBACK_GENERATOR_NOTIFICATION_TYPE_SUCCESS: scala.Double = js.native
  /**
  			 * The warning notification type used as the argument in <Titanium.UI.iOS.FeedbackGenerator.notificationOccurred>.
  			 */
  val FEEDBACK_GENERATOR_NOTIFICATION_TYPE_WARNING: scala.Double = js.native
  /**
  			 * The feedback type to be used when specifying an impact in <Titanium.UI.iOS.FeedbackGenerator>.
  			 */
  val FEEDBACK_GENERATOR_TYPE_IMPACT: scala.Double = js.native
  /**
  			 * The feedback type to be used when specifying a received notification in <Titanium.UI.iOS.FeedbackGenerator>.
  			 */
  val FEEDBACK_GENERATOR_TYPE_NOTIFICATION: scala.Double = js.native
  /**
  			 * The feedback type to be used when specifying a selection in <Titanium.UI.iOS.FeedbackGenerator>.
  			 */
  val FEEDBACK_GENERATOR_TYPE_SELECTION: scala.Double = js.native
  /**
  			 * Inject the script after the document finishes loading, but before other subresources finish loading.
  			 */
  val INJECTION_TIME_DOCUMENT_END: scala.Double = js.native
  /**
  			 * Inject the script after the document element is created, but before any other content is loaded.
  			 */
  val INJECTION_TIME_DOCUMENT_START: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.ScrollView.keyboardDismissMode> to control keyboard dismiss mode.
  			 */
  val KEYBOARD_DISMISS_MODE_INTERACTIVE: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.ScrollView.keyboardDismissMode> to control keyboard dismiss mode.
  			 */
  val KEYBOARD_DISMISS_MODE_NONE: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.ScrollView.keyboardDismissMode> to control keyboard dismiss mode.
  			 */
  val KEYBOARD_DISMISS_MODE_ON_DRAG: scala.Double = js.native
  /**
  			 * Always use a larger title when this item is top most.
  			 */
  val LARGE_TITLE_DISPLAY_MODE_ALWAYS: scala.Double = js.native
  /**
  			 * Automatically use the large out-of-line title based on the state of the p
  			 * revious item in the navigation bar.
  			 */
  val LARGE_TITLE_DISPLAY_MODE_AUTOMATIC: scala.Double = js.native
  /**
  			 * Never use a larger title when this item is top most.
  			 */
  val LARGE_TITLE_DISPLAY_MODE_NEVER: scala.Double = js.native
  /**
  			 * To indicate that the Live Photo aspect is turned off and it will
  			 * be treated as a still (e.g. for sharing).
  			 */
  val LIVEPHOTO_BADGE_OPTIONS_LIVE_OFF: scala.Double = js.native
  /**
  			 * Include treatments so this image can be shown directly over the content
  			 * of the Live Photo.
  			 */
  val LIVEPHOTO_BADGE_OPTIONS_OVER_CONTENT: scala.Double = js.native
  /**
  			 * Plays back the entire motion and sound content of the Live Photo, including transition
  			 * effects at the start and end.
  			 */
  val LIVEPHOTO_PLAYBACK_STYLE_FULL: scala.Double = js.native
  /**
  			 * Plays back only a brief section of the motion content of the Live Photo, without sound.
  			 */
  val LIVEPHOTO_PLAYBACK_STYLE_HINT: scala.Double = js.native
  /**
  			 * An arrow that is automatically aligned.
  			 */
  val MENU_POPUP_ARROW_DIRECTION_DEFAULT: scala.Double = js.native
  /**
  			 * An arrow that points downward.
  			 */
  val MENU_POPUP_ARROW_DIRECTION_DOWN: scala.Double = js.native
  /**
  			 * An arrow that points toward the left.
  			 */
  val MENU_POPUP_ARROW_DIRECTION_LEFT: scala.Double = js.native
  /**
  			 * An arrow that points toward the right.
  			 */
  val MENU_POPUP_ARROW_DIRECTION_RIGHT: scala.Double = js.native
  /**
  			 * An arrow that points upward.
  			 */
  val MENU_POPUP_ARROW_DIRECTION_UP: scala.Double = js.native
  /**
  			 * View presented with the same style as its parent window.
  			 */
  var MODAL_PRESENTATION_CURRENT_CONTEXT: scala.Double = js.native
  /**
  			 * Window width and height are smaller than those of the screen and the view is centered on
  			 * the screen.
  			 */
  val MODAL_PRESENTATION_FORMSHEET: scala.Double = js.native
  /**
  			 * Window covers the screen.
  			 */
  val MODAL_PRESENTATION_FULLSCREEN: scala.Double = js.native
  /**
  			 * View presented over its parent window.
  			 */
  var MODAL_PRESENTATION_OVER_CURRENT_CONTEXT: scala.Double = js.native
  /**
  			 * Presented view covers the screen.
  			 */
  var MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN: scala.Double = js.native
  /**
  			 * Window height is the height of the screen and width is equal to screen width in a portrait
  			 * orientation.
  			 */
  val MODAL_PRESENTATION_PAGESHEET: scala.Double = js.native
  /**
  			 * When the window is presented, its view slides up from the bottom of the screen. On dismissal,
  			 * the view slides back down (default.)
  			 */
  val MODAL_TRANSITION_STYLE_COVER_VERTICAL: scala.Double = js.native
  /**
  			 * When the window is presented, the current view fades out while the new view fades in at the
  			 * same time. On dismissal, a similar type of cross-fade is used to return to the original view.
  			 */
  val MODAL_TRANSITION_STYLE_CROSS_DISSOLVE: scala.Double = js.native
  /**
  			 * When the window is presented, the current view initiates a horizontal 3D flip from
  			 * right-to-left, resulting in the revealing of the new view as if it were on the back of the
  			 * previous view. On dismissal, the flip occurs from left-to-right, returning to the original
  			 * view.
  			 */
  val MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL: scala.Double = js.native
  /**
  			 * When the window is presented, one corner of the current view curls up to reveal the modal
  			 * view underneath. On dismissal, the curled up page unfurls itself back on top of the modal
  			 * view.
  			 */
  val MODAL_TRANSITION_STYLE_PARTIAL_CURL: scala.Double = js.native
  /**
  			 * The normal style for preview actions.
  			 */
  val PREVIEW_ACTION_STYLE_DEFAULT: scala.Double = js.native
  /**
  			 * The destructive style for preview actions.
  			 */
  val PREVIEW_ACTION_STYLE_DESTRUCTIVE: scala.Double = js.native
  /**
  			 * The selected style for preview actions.
  			 */
  val PREVIEW_ACTION_STYLE_SELECTED: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.iOS.PushBehavior.pushMode> to specifiy a continuous force.
  			 */
  val PUSH_MODE_CONTINUOUS: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.iOS.PushBehavior.pushMode> to specifiy an instantaneous force.
  			 */
  val PUSH_MODE_INSTANTANEOUS: scala.Double = js.native
  /**
  			 * A set of constants for the bar styles used on the `style` property of <Titanium.UI.ProgressBar>.
  			 */
  val ProgressBarStyleNs: TypeofProgressBarStyle = js.native
  /**
  			 * The default style for <RowActionType>.
  			 */
  val ROW_ACTION_STYLE_DEFAULT: scala.Double = js.native
  /**
  			 * The destructive style for <RowActionType>.
  			 */
  val ROW_ACTION_STYLE_DESTRUCTIVE: scala.Double = js.native
  /**
  			 * The normal style for <RowActionType>.
  			 */
  val ROW_ACTION_STYLE_NORMAL: scala.Double = js.native
  /**
  			 * A set of constants for the Animation Styles used for transition on table view rows.
  			 */
  val RowAnimationStyleNs: TypeofRowAnimationStyle = js.native
  /**
  			 * Use with <Titanium.UI.ScrollView.decelerationRate> to control deceleration rate.
  			 */
  val SCROLL_DECELERATION_RATE_FAST: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.ScrollView.decelerationRate> to control deceleration rate.
  			 */
  val SCROLL_DECELERATION_RATE_NORMAL: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.SearchBar.style> to change the search bar style.
  			 */
  val SEARCH_BAR_STYLE_MINIMAL: scala.Double = js.native
  /**
  			 * Use with <Titanium.UI.SearchBar.style> to change the search bar style.
  			 */
  val SEARCH_BAR_STYLE_PROMINENT: scala.Double = js.native
  /**
  			 * Selection endpoints can be placed at any character boundary.
  			 */
  val SELECTION_GRANULARITY_CHARACTER: scala.Double = js.native
  /**
  			 * Selection granularity varies automatically depending on the selection.
  			 */
  val SELECTION_GRANULARITY_DYNAMIC: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_ADD: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_ALARM: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_AUDIO: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_BOOKMARK: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_CAPTURE_PHOTO: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_CAPTURE_VIDEO: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_CLOUD: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_COMPOSE: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_CONFIRMATION: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_CONTACT: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_DATE: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_FAVORITE: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_HOME: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_INVITATION: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_LOCATION: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_LOVE: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_MAIL: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_MARK_LOCATION: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_MESSAGE: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_PAUSE: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_PLAY: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_PROHIBIT: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_SEARCH: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_SHARE: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_SHUFFLE: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_TASK: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_TASK_COMPLETED: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_TIME: scala.Double = js.native
  /**
  			 * Number that represents the icon used for the application shortcut
  			 */
  val SHORTCUT_ICON_TYPE_UPDATE: scala.Double = js.native
  /**
  			 * A set of constants for the styles available for scrollbars used with <Titanium.UI.ScrollView.scrollIndicatorStyle> and <Titanium.UI.TableView.scrollIndicatorStyle> properties.
  			 */
  val ScrollIndicatorStyleNs: TypeofScrollIndicatorStyle = js.native
  /**
  			 * A set of constants for the status bar style.
  			 */
  val StatusBarNs: TypeofStatusBar = js.native
  /**
  			 * A set of constants for creating standard iOS system buttons.
  			 */
  val SystemButtonNs: TypeofSystemButton = js.native
  /**
  			 * A set of constants for the system button styles that can be used for the button `style` property.
  			 */
  val SystemButtonStyleNs: TypeofSystemButtonStyle = js.native
  /**
  			 * A set of constants for the system icon styles that can be used on a tab group tab.
  			 */
  val SystemIconNs: TypeofSystemIcon = js.native
  /**
  			 * String that represents the magnifying glass on the table view index bar
  			 */
  val TABLEVIEW_INDEX_SEARCH: java.lang.String = js.native
  /**
  			 * A set of constants for the style that can be used for the `selectionStyle` property of
  			 * <Titanium.UI.TableViewRow>.
  			 */
  val TableViewCellSelectionStyleNs: TypeofTableViewCellSelectionStyle = js.native
  /**
  			 * A set of constants for the position value that can be used for the `position` property of
  			 * <Titanium.UI.TableView> when invoking `scrollToIndex`.
  			 */
  val TableViewScrollPositionNs: TypeofTableViewScrollPosition = js.native
  /**
  			 * A set of constants for the style that can be used for the button `style` property of
  			 * <Titanium.UI.TableView>.
  			 */
  val TableViewStyleNs: TypeofTableViewStyle = js.native
  /**
  			 * User tapped the back or forward button.
  			 */
  val WEBVIEW_NAVIGATIONTYPE_BACK_FORWARD: scala.Double = js.native
  /**
  			 * User resubmitted a form.
  			 */
  val WEBVIEW_NAVIGATIONTYPE_FORM_RESUBMITTED: scala.Double = js.native
  /**
  			 * User submitted a form.
  			 */
  val WEBVIEW_NAVIGATIONTYPE_FORM_SUBMITTED: scala.Double = js.native
  /**
  			 * User tapped a link.
  			 */
  val WEBVIEW_NAVIGATIONTYPE_LINK_CLICKED: scala.Double = js.native
  /**
  			 * Some other action occurred.
  			 */
  val WEBVIEW_NAVIGATIONTYPE_OTHER: scala.Double = js.native
  /**
  			 * User tapped the reload button.
  			 */
  val WEBVIEW_NAVIGATIONTYPE_RELOAD: scala.Double = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String = js.native
  /**
  			 * Value of the badge for the application's springboard icon.
  			 */
  var appBadge: scala.Double = js.native
  /**
  			 * Determines whether the shake to edit system-wide capability is enabled.
  			 */
  var appSupportsShakeToEdit: scala.Boolean = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean = js.native
  /**
  			 * Determines if the 3D-Touch capability "Force Touch" is supported (`true`) or not (`false`) by the device.
  			 */
  val forceTouchSupported: scala.Boolean = js.native
  /**
  			 * Sets the global status bar background color for the application.
  			 */
  var statusBarBackgroundColor: java.lang.String = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.AdView>.
  			 */
  def createAdView(): titaniumLib.TitaniumNs.UINs.iOSNs.AdView = js.native
  def createAdView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.AdView = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.AnchorAttachmentBehavior>.
  			 */
  def createAnchorAttachmentBehavior(): titaniumLib.TitaniumNs.UINs.iOSNs.AnchorAttachmentBehavior = js.native
  def createAnchorAttachmentBehavior(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.AnchorAttachmentBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.Animator>.
  			 */
  def createAnimator(): titaniumLib.TitaniumNs.UINs.iOSNs.Animator = js.native
  def createAnimator(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.Animator = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.ApplicationShortcuts>.
  			 */
  def createApplicationShortcuts(): titaniumLib.TitaniumNs.UINs.iOSNs.ApplicationShortcuts = js.native
  def createApplicationShortcuts(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.ApplicationShortcuts = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.Attribute>.
  			 */
  def createAttribute(): titaniumLib.TitaniumNs.UINs.iOSNs.Attribute = js.native
  def createAttribute(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.Attribute = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.AttributedString>.
  			 */
  def createAttributedString(): titaniumLib.TitaniumNs.UINs.iOSNs.AttributedString = js.native
  def createAttributedString(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.AttributedString = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.BlurView>.
  			 */
  def createBlurView(): titaniumLib.TitaniumNs.UINs.iOSNs.BlurView = js.native
  def createBlurView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.BlurView = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.CollisionBehavior>.
  			 */
  def createCollisionBehavior(): titaniumLib.TitaniumNs.UINs.iOSNs.CollisionBehavior = js.native
  def createCollisionBehavior(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.CollisionBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.CoverFlowView>.
  			 */
  def createCoverFlowView(): titaniumLib.TitaniumNs.UINs.iOSNs.CoverFlowView = js.native
  def createCoverFlowView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.CoverFlowView = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.DocumentViewer>.
  			 */
  def createDocumentViewer(): titaniumLib.TitaniumNs.UINs.iOSNs.DocumentViewer = js.native
  def createDocumentViewer(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.DocumentViewer = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.DynamicItemBehavior>.
  			 */
  def createDynamicItemBehavior(): titaniumLib.TitaniumNs.UINs.iOSNs.DynamicItemBehavior = js.native
  def createDynamicItemBehavior(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.DynamicItemBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.FeedbackGenerator>.
  			 */
  def createFeedbackGenerator(): titaniumLib.TitaniumNs.UINs.iOSNs.FeedbackGenerator = js.native
  def createFeedbackGenerator(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.FeedbackGenerator = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.GravityBehavior>.
  			 */
  def createGravityBehavior(): titaniumLib.TitaniumNs.UINs.iOSNs.GravityBehavior = js.native
  def createGravityBehavior(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.GravityBehavior = js.native
  /**
  			 * Creates a live photo badge to be used together with the
  			 * <Titanium.UI.iOS.LivePhotoView> API.
  			 */
  def createLivePhotoBadge(`type`: scala.Double): titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.LivePhotoView>.
  			 */
  def createLivePhotoView(): titaniumLib.TitaniumNs.UINs.iOSNs.LivePhotoView = js.native
  def createLivePhotoView(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.LivePhotoView = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.MenuPopup>.
  			 */
  def createMenuPopup(): titaniumLib.TitaniumNs.UINs.iOSNs.MenuPopup = js.native
  def createMenuPopup(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.MenuPopup = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.NavigationWindow>.
  			 */
  def createNavigationWindow(): titaniumLib.TitaniumNs.UINs.iOSNs.NavigationWindow = js.native
  def createNavigationWindow(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.NavigationWindow = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.PreviewAction>.
  			 */
  def createPreviewAction(): titaniumLib.TitaniumNs.UINs.iOSNs.PreviewAction = js.native
  def createPreviewAction(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.PreviewAction = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.PreviewActionGroup>.
  			 */
  def createPreviewActionGroup(): titaniumLib.TitaniumNs.UINs.iOSNs.PreviewActionGroup = js.native
  def createPreviewActionGroup(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.PreviewActionGroup = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.PreviewContext>.
  			 */
  def createPreviewContext(): titaniumLib.TitaniumNs.UINs.iOSNs.PreviewContext = js.native
  def createPreviewContext(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.PreviewContext = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.PushBehavior>.
  			 */
  def createPushBehavior(): titaniumLib.TitaniumNs.UINs.iOSNs.PushBehavior = js.native
  def createPushBehavior(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.PushBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.SnapBehavior>.
  			 */
  def createSnapBehavior(): titaniumLib.TitaniumNs.UINs.iOSNs.SnapBehavior = js.native
  def createSnapBehavior(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.SnapBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.SplitWindow>.
  			 */
  def createSplitWindow(): titaniumLib.TitaniumNs.UINs.iOSNs.SplitWindow = js.native
  def createSplitWindow(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.SplitWindow = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.Stepper>.
  			 */
  def createStepper(): titaniumLib.TitaniumNs.UINs.iOSNs.Stepper = js.native
  def createStepper(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.Stepper = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.TabbedBar>.
  			 */
  def createTabbedBar(): titaniumLib.TitaniumNs.UINs.iOSNs.TabbedBar = js.native
  def createTabbedBar(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.TabbedBar = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.Toolbar>.
  			 */
  def createToolbar(): titaniumLib.TitaniumNs.UINs.iOSNs.Toolbar = js.native
  def createToolbar(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.Toolbar = js.native
  /**
  			 * Creates a transition animation when opening or closing windows in a
  			 * <Titanium.UI.NavigationWindow> or <Titanium.UI.Tab>.
  			 */
  def createTransitionAnimation(transition: transitionAnimationParam): titaniumLib.TitaniumNs.Proxy = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.ViewAttachmentBehavior>.
  			 */
  def createViewAttachmentBehavior(): titaniumLib.TitaniumNs.UINs.iOSNs.ViewAttachmentBehavior = js.native
  def createViewAttachmentBehavior(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.ViewAttachmentBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.WebViewConfiguration>.
  			 */
  def createWebViewConfiguration(): titaniumLib.TitaniumNs.UINs.iOSNs.WebViewConfiguration = js.native
  def createWebViewConfiguration(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.WebViewConfiguration = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.WebViewDecisionHandler>.
  			 */
  def createWebViewDecisionHandler(): titaniumLib.TitaniumNs.UINs.iOSNs.WebViewDecisionHandler = js.native
  def createWebViewDecisionHandler(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.WebViewDecisionHandler = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.WebViewProcessPool>.
  			 */
  def createWebViewProcessPool(): titaniumLib.TitaniumNs.UINs.iOSNs.WebViewProcessPool = js.native
  def createWebViewProcessPool(parameters: js.Any): titaniumLib.TitaniumNs.UINs.iOSNs.WebViewProcessPool = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iOS.apiName> property.
  			 */
  def getApiName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iOS.appBadge> property.
  			 */
  def getAppBadge(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iOS.appSupportsShakeToEdit> property.
  			 */
  def getAppSupportsShakeToEdit(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iOS.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iOS.forceTouchSupported> property.
  			 */
  def getForceTouchSupported(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.iOS.statusBarBackgroundColor> property.
  			 */
  def getStatusBarBackgroundColor(): java.lang.String = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iOS.appBadge> property.
  			 */
  def setAppBadge(appBadge: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iOS.appSupportsShakeToEdit> property.
  			 */
  def setAppSupportsShakeToEdit(appSupportsShakeToEdit: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iOS.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iOS.MODAL_PRESENTATION_CURRENT_CONTEXT> property.
  			 */
  def setMODAL_PRESENTATION_CURRENT_CONTEXT(MODAL_PRESENTATION_CURRENT_CONTEXT: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_CONTEXT> property.
  			 */
  def setMODAL_PRESENTATION_OVER_CURRENT_CONTEXT(MODAL_PRESENTATION_OVER_CURRENT_CONTEXT: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN> property.
  			 */
  def setMODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN(MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.iOS.statusBarBackgroundColor> property.
  			 */
  def setStatusBarBackgroundColor(statusBarBackgroundColor: java.lang.String): scala.Unit = js.native
}

