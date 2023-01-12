package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGSVGElement
import typings.wordpressComponents.dashiconMod.Dashicon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashiconMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/dashicon", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Dashicon {
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-appearance`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-collapse`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-comments`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-customizer`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-generic`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-home`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-links`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-media`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-multisite`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-network`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-page`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-plugins`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-post`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-settings`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-site`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt3`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-tools`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-users`
      - typings.wordpressComponents.wordpressComponentsStrings.airplane
      - typings.wordpressComponents.wordpressComponentsStrings.album
      - typings.wordpressComponents.wordpressComponentsStrings.`align-center`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-full-width`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-left`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-none`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-pull-left`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-pull-right`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-right`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-wide`
      - typings.wordpressComponents.wordpressComponentsStrings.amazon
      - typings.wordpressComponents.wordpressComponentsStrings.analytics
      - typings.wordpressComponents.wordpressComponentsStrings.archive
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-down`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-left`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-right`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-up`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.art
      - typings.wordpressComponents.wordpressComponentsStrings.awards
      - typings.wordpressComponents.wordpressComponentsStrings.backup
      - typings.wordpressComponents.wordpressComponentsStrings.bank
      - typings.wordpressComponents.wordpressComponentsStrings.beer
      - typings.wordpressComponents.wordpressComponentsStrings.bell
      - typings.wordpressComponents.wordpressComponentsStrings.`block-default`
      - typings.wordpressComponents.wordpressComponentsStrings.book
      - typings.wordpressComponents.wordpressComponentsStrings.`book-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-activity`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-bbpress-logo`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-buddypress-logo`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-community`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-forums`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-friends`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-groups`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-pm`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-replies`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-topics`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-tracking`
      - typings.wordpressComponents.wordpressComponentsStrings.building
      - typings.wordpressComponents.wordpressComponentsStrings.businessman
      - typings.wordpressComponents.wordpressComponentsStrings.businessperson
      - typings.wordpressComponents.wordpressComponentsStrings.businesswoman
      - typings.wordpressComponents.wordpressComponentsStrings.button
      - typings.wordpressComponents.wordpressComponentsStrings.calculator
      - typings.wordpressComponents.wordpressComponentsStrings.calendar
      - typings.wordpressComponents.wordpressComponentsStrings.`calendar-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.camera
      - typings.wordpressComponents.wordpressComponentsStrings.`camera-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.car
      - typings.wordpressComponents.wordpressComponentsStrings.carrot
      - typings.wordpressComponents.wordpressComponentsStrings.cart
      - typings.wordpressComponents.wordpressComponentsStrings.category
      - typings.wordpressComponents.wordpressComponentsStrings.`chart-area`
      - typings.wordpressComponents.wordpressComponentsStrings.`chart-bar`
      - typings.wordpressComponents.wordpressComponentsStrings.`chart-line`
      - typings.wordpressComponents.wordpressComponentsStrings.`chart-pie`
      - typings.wordpressComponents.wordpressComponentsStrings.clipboard
      - typings.wordpressComponents.wordpressComponentsStrings.clock
      - typings.wordpressComponents.wordpressComponentsStrings.cloud
      - typings.wordpressComponents.wordpressComponentsStrings.`cloud-saved`
      - typings.wordpressComponents.wordpressComponentsStrings.`cloud-upload`
      - typings.wordpressComponents.wordpressComponentsStrings.`code-standards`
      - typings.wordpressComponents.wordpressComponentsStrings.coffee
      - typings.wordpressComponents.wordpressComponentsStrings.`color-picker`
      - typings.wordpressComponents.wordpressComponentsStrings.columns
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-back`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-forward`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-pause`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-play`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-repeat`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-skipback`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-skipforward`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeoff`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeon`
      - typings.wordpressComponents.wordpressComponentsStrings.`cover-image`
      - typings.wordpressComponents.wordpressComponentsStrings.dashboard
      - typings.wordpressComponents.wordpressComponentsStrings.database
      - typings.wordpressComponents.wordpressComponentsStrings.`database-add`
      - typings.wordpressComponents.wordpressComponentsStrings.`database-export`
      - typings.wordpressComponents.wordpressComponentsStrings.`database-import`
      - typings.wordpressComponents.wordpressComponentsStrings.`database-remove`
      - typings.wordpressComponents.wordpressComponentsStrings.`database-view`
      - typings.wordpressComponents.wordpressComponentsStrings.desktop
      - typings.wordpressComponents.wordpressComponentsStrings.dismiss
      - typings.wordpressComponents.wordpressComponentsStrings.download
      - typings.wordpressComponents.wordpressComponentsStrings.drumstick
      - typings.wordpressComponents.wordpressComponentsStrings.edit
      - typings.wordpressComponents.wordpressComponentsStrings.`edit-large`
      - typings.wordpressComponents.wordpressComponentsStrings.`edit-page`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-aligncenter`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-alignleft`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-alignright`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-bold`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-break`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-code`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-contract`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-customchar`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-expand`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-help`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-indent`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-insertmore`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-italic`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-justify`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-kitchensink`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-ltr`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-ol`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-ol-rtl`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-outdent`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-paragraph`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-text`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-word`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-quote`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-removeformatting`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-rtl`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-spellcheck`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-strikethrough`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-table`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-textcolor`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-ul`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-underline`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-unlink`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-video`
      - typings.wordpressComponents.wordpressComponentsStrings.ellipsis
      - typings.wordpressComponents.wordpressComponentsStrings.email
      - typings.wordpressComponents.wordpressComponentsStrings.`email-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`email-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`embed-audio`
      - typings.wordpressComponents.wordpressComponentsStrings.`embed-generic`
      - typings.wordpressComponents.wordpressComponentsStrings.`embed-photo`
      - typings.wordpressComponents.wordpressComponentsStrings.`embed-post`
      - typings.wordpressComponents.wordpressComponentsStrings.`embed-video`
      - typings.wordpressComponents.wordpressComponentsStrings.`excerpt-view`
      - typings.wordpressComponents.wordpressComponentsStrings.exit
      - typings.wordpressComponents.wordpressComponentsStrings.external
      - typings.wordpressComponents.wordpressComponentsStrings.facebook
      - typings.wordpressComponents.wordpressComponentsStrings.`facebook-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.feedback
      - typings.wordpressComponents.wordpressComponentsStrings.filter
      - typings.wordpressComponents.wordpressComponentsStrings.flag
      - typings.wordpressComponents.wordpressComponentsStrings.food
      - typings.wordpressComponents.wordpressComponentsStrings.`format-aside`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-audio`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-chat`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-gallery`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-image`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-quote`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-status`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-video`
      - typings.wordpressComponents.wordpressComponentsStrings.forms
      - typings.wordpressComponents.wordpressComponentsStrings.`fullscreen-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`fullscreen-exit-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.games
      - typings.wordpressComponents.wordpressComponentsStrings.google
      - typings.wordpressComponents.wordpressComponentsStrings.`grid-view`
      - typings.wordpressComponents.wordpressComponentsStrings.groups
      - typings.wordpressComponents.wordpressComponentsStrings.hammer
      - typings.wordpressComponents.wordpressComponentsStrings.heading
      - typings.wordpressComponents.wordpressComponentsStrings.heart
      - typings.wordpressComponents.wordpressComponentsStrings.hidden
      - typings.wordpressComponents.wordpressComponentsStrings.hourglass
      - typings.wordpressComponents.wordpressComponentsStrings.html
      - typings.wordpressComponents.wordpressComponentsStrings.id
      - typings.wordpressComponents.wordpressComponentsStrings.`id-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-crop`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-filter`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-flip-horizontal`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-flip-vertical`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-rotate`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-left`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-right`
      - typings.wordpressComponents.wordpressComponentsStrings.`images-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`images-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`index-card`
      - typings.wordpressComponents.wordpressComponentsStrings.info
      - typings.wordpressComponents.wordpressComponentsStrings.`info-outline`
      - typings.wordpressComponents.wordpressComponentsStrings.insert
      - typings.wordpressComponents.wordpressComponentsStrings.`insert-after`
      - typings.wordpressComponents.wordpressComponentsStrings.`insert-before`
      - typings.wordpressComponents.wordpressComponentsStrings.instagram
      - typings.wordpressComponents.wordpressComponentsStrings.laptop
      - typings.wordpressComponents.wordpressComponentsStrings.layout
      - typings.wordpressComponents.wordpressComponentsStrings.leftright
      - typings.wordpressComponents.wordpressComponentsStrings.lightbulb
      - typings.wordpressComponents.wordpressComponentsStrings.linkedin
      - typings.wordpressComponents.wordpressComponentsStrings.`list-view`
      - typings.wordpressComponents.wordpressComponentsStrings.location
      - typings.wordpressComponents.wordpressComponentsStrings.`location-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.lock
      - typings.wordpressComponents.wordpressComponentsStrings.marker
      - typings.wordpressComponents.wordpressComponentsStrings.`media-archive`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-audio`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-code`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-default`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-document`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-interactive`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-spreadsheet`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-text`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-video`
      - typings.wordpressComponents.wordpressComponentsStrings.megaphone
      - typings.wordpressComponents.wordpressComponentsStrings.menu
      - typings.wordpressComponents.wordpressComponentsStrings.`menu-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`menu-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`menu-alt3`
      - typings.wordpressComponents.wordpressComponentsStrings.microphone
      - typings.wordpressComponents.wordpressComponentsStrings.migrate
      - typings.wordpressComponents.wordpressComponentsStrings.minus
      - typings.wordpressComponents.wordpressComponentsStrings.money
      - typings.wordpressComponents.wordpressComponentsStrings.`money-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.move
      - typings.wordpressComponents.wordpressComponentsStrings.nametag
      - typings.wordpressComponents.wordpressComponentsStrings.networking
      - typings.wordpressComponents.wordpressComponentsStrings.no
      - typings.wordpressComponents.wordpressComponentsStrings.`no-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`open-folder`
      - typings.wordpressComponents.wordpressComponentsStrings.palmtree
      - typings.wordpressComponents.wordpressComponentsStrings.paperclip
      - typings.wordpressComponents.wordpressComponentsStrings.pdf
      - typings.wordpressComponents.wordpressComponentsStrings.performance
      - typings.wordpressComponents.wordpressComponentsStrings.pets
      - typings.wordpressComponents.wordpressComponentsStrings.phone
      - typings.wordpressComponents.wordpressComponentsStrings.pinterest
      - typings.wordpressComponents.wordpressComponentsStrings.`playlist-audio`
      - typings.wordpressComponents.wordpressComponentsStrings.`playlist-video`
      - typings.wordpressComponents.wordpressComponentsStrings.`plugins-checked`
      - typings.wordpressComponents.wordpressComponentsStrings.plus
      - typings.wordpressComponents.wordpressComponentsStrings.`plus-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`plus-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.podio
      - typings.wordpressComponents.wordpressComponentsStrings.portfolio
      - typings.wordpressComponents.wordpressComponentsStrings.`post-status`
      - typings.wordpressComponents.wordpressComponentsStrings.pressthis
      - typings.wordpressComponents.wordpressComponentsStrings.printer
      - typings.wordpressComponents.wordpressComponentsStrings.privacy
      - typings.wordpressComponents.wordpressComponentsStrings.products
      - typings.wordpressComponents.wordpressComponentsStrings.randomize
      - typings.wordpressComponents.wordpressComponentsStrings.reddit
      - typings.wordpressComponents.wordpressComponentsStrings.redo
      - typings.wordpressComponents.wordpressComponentsStrings.remove
      - typings.wordpressComponents.wordpressComponentsStrings.`rest-api`
      - typings.wordpressComponents.wordpressComponentsStrings.rss
      - typings.wordpressComponents.wordpressComponentsStrings.saved
      - typings.wordpressComponents.wordpressComponentsStrings.schedule
      - typings.wordpressComponents.wordpressComponentsStrings.screenoptions
      - typings.wordpressComponents.wordpressComponentsStrings.search
      - typings.wordpressComponents.wordpressComponentsStrings.share
      - typings.wordpressComponents.wordpressComponentsStrings.`share-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`share-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.shield
      - typings.wordpressComponents.wordpressComponentsStrings.`shield-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.shortcode
      - typings.wordpressComponents.wordpressComponentsStrings.slides
      - typings.wordpressComponents.wordpressComponentsStrings.smartphone
      - typings.wordpressComponents.wordpressComponentsStrings.smiley
      - typings.wordpressComponents.wordpressComponentsStrings.sort
      - typings.wordpressComponents.wordpressComponentsStrings.sos
      - typings.wordpressComponents.wordpressComponentsStrings.spotify
      - typings.wordpressComponents.wordpressComponentsStrings.`star-empty`
      - typings.wordpressComponents.wordpressComponentsStrings.`star-filled`
      - typings.wordpressComponents.wordpressComponentsStrings.`star-half`
      - typings.wordpressComponents.wordpressComponentsStrings.sticky
      - typings.wordpressComponents.wordpressComponentsStrings.store
      - typings.wordpressComponents.wordpressComponentsStrings.superhero
      - typings.wordpressComponents.wordpressComponentsStrings.`superhero-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-col-after`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-col-before`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-col-delete`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-row-after`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-row-before`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-row-delete`
      - typings.wordpressComponents.wordpressComponentsStrings.tablet
      - typings.wordpressComponents.wordpressComponentsStrings.tag
      - typings.wordpressComponents.wordpressComponentsStrings.tagcloud
      - typings.wordpressComponents.wordpressComponentsStrings.testimonial
      - typings.wordpressComponents.wordpressComponentsStrings.text
      - typings.wordpressComponents.wordpressComponentsStrings.`text-page`
      - typings.wordpressComponents.wordpressComponentsStrings.`thumbs-down`
      - typings.wordpressComponents.wordpressComponentsStrings.`thumbs-up`
      - typings.wordpressComponents.wordpressComponentsStrings.tickets
      - typings.wordpressComponents.wordpressComponentsStrings.`tickets-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.tide
      - typings.wordpressComponents.wordpressComponentsStrings.translation
      - typings.wordpressComponents.wordpressComponentsStrings.trash
      - typings.wordpressComponents.wordpressComponentsStrings.twitch
      - typings.wordpressComponents.wordpressComponentsStrings.twitter
      - typings.wordpressComponents.wordpressComponentsStrings.`twitter-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.undo
      - typings.wordpressComponents.wordpressComponentsStrings.`universal-access`
      - typings.wordpressComponents.wordpressComponentsStrings.`universal-access-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.unlock
      - typings.wordpressComponents.wordpressComponentsStrings.update
      - typings.wordpressComponents.wordpressComponentsStrings.`update-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.upload
      - typings.wordpressComponents.wordpressComponentsStrings.vault
      - typings.wordpressComponents.wordpressComponentsStrings.`video-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`video-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`video-alt3`
      - typings.wordpressComponents.wordpressComponentsStrings.visibility
      - typings.wordpressComponents.wordpressComponentsStrings.warning
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-add-page`
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-comments`
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-learn-more`
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-view-site`
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-widgets-menus`
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-write-blog`
      - typings.wordpressComponents.wordpressComponentsStrings.whatsapp
      - typings.wordpressComponents.wordpressComponentsStrings.wordpress
      - typings.wordpressComponents.wordpressComponentsStrings.`wordpress-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.xing
      - typings.wordpressComponents.wordpressComponentsStrings.yes
      - typings.wordpressComponents.wordpressComponentsStrings.`yes-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.youtube
    */
    trait Icon extends StObject
    object Icon {
      
      inline def `admin-appearance`: typings.wordpressComponents.wordpressComponentsStrings.`admin-appearance` = "admin-appearance".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-appearance`]
      
      inline def `admin-collapse`: typings.wordpressComponents.wordpressComponentsStrings.`admin-collapse` = "admin-collapse".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-collapse`]
      
      inline def `admin-comments`: typings.wordpressComponents.wordpressComponentsStrings.`admin-comments` = "admin-comments".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-comments`]
      
      inline def `admin-customizer`: typings.wordpressComponents.wordpressComponentsStrings.`admin-customizer` = "admin-customizer".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-customizer`]
      
      inline def `admin-generic`: typings.wordpressComponents.wordpressComponentsStrings.`admin-generic` = "admin-generic".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-generic`]
      
      inline def `admin-home`: typings.wordpressComponents.wordpressComponentsStrings.`admin-home` = "admin-home".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-home`]
      
      inline def `admin-links`: typings.wordpressComponents.wordpressComponentsStrings.`admin-links` = "admin-links".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-links`]
      
      inline def `admin-media`: typings.wordpressComponents.wordpressComponentsStrings.`admin-media` = "admin-media".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-media`]
      
      inline def `admin-multisite`: typings.wordpressComponents.wordpressComponentsStrings.`admin-multisite` = "admin-multisite".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-multisite`]
      
      inline def `admin-network`: typings.wordpressComponents.wordpressComponentsStrings.`admin-network` = "admin-network".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-network`]
      
      inline def `admin-page`: typings.wordpressComponents.wordpressComponentsStrings.`admin-page` = "admin-page".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-page`]
      
      inline def `admin-plugins`: typings.wordpressComponents.wordpressComponentsStrings.`admin-plugins` = "admin-plugins".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-plugins`]
      
      inline def `admin-post`: typings.wordpressComponents.wordpressComponentsStrings.`admin-post` = "admin-post".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-post`]
      
      inline def `admin-settings`: typings.wordpressComponents.wordpressComponentsStrings.`admin-settings` = "admin-settings".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-settings`]
      
      inline def `admin-site`: typings.wordpressComponents.wordpressComponentsStrings.`admin-site` = "admin-site".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-site`]
      
      inline def `admin-site-alt`: typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt` = "admin-site-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt`]
      
      inline def `admin-site-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt2` = "admin-site-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt2`]
      
      inline def `admin-site-alt3`: typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt3` = "admin-site-alt3".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt3`]
      
      inline def `admin-tools`: typings.wordpressComponents.wordpressComponentsStrings.`admin-tools` = "admin-tools".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-tools`]
      
      inline def `admin-users`: typings.wordpressComponents.wordpressComponentsStrings.`admin-users` = "admin-users".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-users`]
      
      inline def airplane: typings.wordpressComponents.wordpressComponentsStrings.airplane = "airplane".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.airplane]
      
      inline def album: typings.wordpressComponents.wordpressComponentsStrings.album = "album".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.album]
      
      inline def `align-center`: typings.wordpressComponents.wordpressComponentsStrings.`align-center` = "align-center".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-center`]
      
      inline def `align-full-width`: typings.wordpressComponents.wordpressComponentsStrings.`align-full-width` = "align-full-width".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-full-width`]
      
      inline def `align-left`: typings.wordpressComponents.wordpressComponentsStrings.`align-left` = "align-left".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-left`]
      
      inline def `align-none`: typings.wordpressComponents.wordpressComponentsStrings.`align-none` = "align-none".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-none`]
      
      inline def `align-pull-left`: typings.wordpressComponents.wordpressComponentsStrings.`align-pull-left` = "align-pull-left".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-pull-left`]
      
      inline def `align-pull-right`: typings.wordpressComponents.wordpressComponentsStrings.`align-pull-right` = "align-pull-right".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-pull-right`]
      
      inline def `align-right`: typings.wordpressComponents.wordpressComponentsStrings.`align-right` = "align-right".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-right`]
      
      inline def `align-wide`: typings.wordpressComponents.wordpressComponentsStrings.`align-wide` = "align-wide".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-wide`]
      
      inline def amazon: typings.wordpressComponents.wordpressComponentsStrings.amazon = "amazon".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.amazon]
      
      inline def analytics: typings.wordpressComponents.wordpressComponentsStrings.analytics = "analytics".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.analytics]
      
      inline def archive: typings.wordpressComponents.wordpressComponentsStrings.archive = "archive".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.archive]
      
      inline def `arrow-down`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-down` = "arrow-down".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-down`]
      
      inline def `arrow-down-alt`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt` = "arrow-down-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt`]
      
      inline def `arrow-down-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt2` = "arrow-down-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt2`]
      
      inline def `arrow-left`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-left` = "arrow-left".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-left`]
      
      inline def `arrow-left-alt`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt` = "arrow-left-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt`]
      
      inline def `arrow-left-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt2` = "arrow-left-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt2`]
      
      inline def `arrow-right`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-right` = "arrow-right".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-right`]
      
      inline def `arrow-right-alt`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt` = "arrow-right-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt`]
      
      inline def `arrow-right-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt2` = "arrow-right-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt2`]
      
      inline def `arrow-up`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-up` = "arrow-up".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-up`]
      
      inline def `arrow-up-alt`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt` = "arrow-up-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt`]
      
      inline def `arrow-up-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt2` = "arrow-up-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt2`]
      
      inline def art: typings.wordpressComponents.wordpressComponentsStrings.art = "art".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.art]
      
      inline def awards: typings.wordpressComponents.wordpressComponentsStrings.awards = "awards".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.awards]
      
      inline def backup: typings.wordpressComponents.wordpressComponentsStrings.backup = "backup".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.backup]
      
      inline def bank: typings.wordpressComponents.wordpressComponentsStrings.bank = "bank".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.bank]
      
      inline def beer: typings.wordpressComponents.wordpressComponentsStrings.beer = "beer".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.beer]
      
      inline def bell: typings.wordpressComponents.wordpressComponentsStrings.bell = "bell".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.bell]
      
      inline def `block-default`: typings.wordpressComponents.wordpressComponentsStrings.`block-default` = "block-default".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`block-default`]
      
      inline def book: typings.wordpressComponents.wordpressComponentsStrings.book = "book".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.book]
      
      inline def `book-alt`: typings.wordpressComponents.wordpressComponentsStrings.`book-alt` = "book-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`book-alt`]
      
      inline def `buddicons-activity`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-activity` = "buddicons-activity".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-activity`]
      
      inline def `buddicons-bbpress-logo`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-bbpress-logo` = "buddicons-bbpress-logo".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-bbpress-logo`]
      
      inline def `buddicons-buddypress-logo`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-buddypress-logo` = "buddicons-buddypress-logo".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-buddypress-logo`]
      
      inline def `buddicons-community`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-community` = "buddicons-community".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-community`]
      
      inline def `buddicons-forums`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-forums` = "buddicons-forums".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-forums`]
      
      inline def `buddicons-friends`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-friends` = "buddicons-friends".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-friends`]
      
      inline def `buddicons-groups`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-groups` = "buddicons-groups".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-groups`]
      
      inline def `buddicons-pm`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-pm` = "buddicons-pm".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-pm`]
      
      inline def `buddicons-replies`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-replies` = "buddicons-replies".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-replies`]
      
      inline def `buddicons-topics`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-topics` = "buddicons-topics".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-topics`]
      
      inline def `buddicons-tracking`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-tracking` = "buddicons-tracking".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-tracking`]
      
      inline def building: typings.wordpressComponents.wordpressComponentsStrings.building = "building".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.building]
      
      inline def businessman: typings.wordpressComponents.wordpressComponentsStrings.businessman = "businessman".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.businessman]
      
      inline def businessperson: typings.wordpressComponents.wordpressComponentsStrings.businessperson = "businessperson".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.businessperson]
      
      inline def businesswoman: typings.wordpressComponents.wordpressComponentsStrings.businesswoman = "businesswoman".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.businesswoman]
      
      inline def button: typings.wordpressComponents.wordpressComponentsStrings.button = "button".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.button]
      
      inline def calculator: typings.wordpressComponents.wordpressComponentsStrings.calculator = "calculator".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.calculator]
      
      inline def calendar: typings.wordpressComponents.wordpressComponentsStrings.calendar = "calendar".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.calendar]
      
      inline def `calendar-alt`: typings.wordpressComponents.wordpressComponentsStrings.`calendar-alt` = "calendar-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`calendar-alt`]
      
      inline def camera: typings.wordpressComponents.wordpressComponentsStrings.camera = "camera".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.camera]
      
      inline def `camera-alt`: typings.wordpressComponents.wordpressComponentsStrings.`camera-alt` = "camera-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`camera-alt`]
      
      inline def car: typings.wordpressComponents.wordpressComponentsStrings.car = "car".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.car]
      
      inline def carrot: typings.wordpressComponents.wordpressComponentsStrings.carrot = "carrot".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.carrot]
      
      inline def cart: typings.wordpressComponents.wordpressComponentsStrings.cart = "cart".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.cart]
      
      inline def category: typings.wordpressComponents.wordpressComponentsStrings.category = "category".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.category]
      
      inline def `chart-area`: typings.wordpressComponents.wordpressComponentsStrings.`chart-area` = "chart-area".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`chart-area`]
      
      inline def `chart-bar`: typings.wordpressComponents.wordpressComponentsStrings.`chart-bar` = "chart-bar".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`chart-bar`]
      
      inline def `chart-line`: typings.wordpressComponents.wordpressComponentsStrings.`chart-line` = "chart-line".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`chart-line`]
      
      inline def `chart-pie`: typings.wordpressComponents.wordpressComponentsStrings.`chart-pie` = "chart-pie".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`chart-pie`]
      
      inline def clipboard: typings.wordpressComponents.wordpressComponentsStrings.clipboard = "clipboard".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.clipboard]
      
      inline def clock: typings.wordpressComponents.wordpressComponentsStrings.clock = "clock".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.clock]
      
      inline def cloud: typings.wordpressComponents.wordpressComponentsStrings.cloud = "cloud".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.cloud]
      
      inline def `cloud-saved`: typings.wordpressComponents.wordpressComponentsStrings.`cloud-saved` = "cloud-saved".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`cloud-saved`]
      
      inline def `cloud-upload`: typings.wordpressComponents.wordpressComponentsStrings.`cloud-upload` = "cloud-upload".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`cloud-upload`]
      
      inline def `code-standards`: typings.wordpressComponents.wordpressComponentsStrings.`code-standards` = "code-standards".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`code-standards`]
      
      inline def coffee: typings.wordpressComponents.wordpressComponentsStrings.coffee = "coffee".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.coffee]
      
      inline def `color-picker`: typings.wordpressComponents.wordpressComponentsStrings.`color-picker` = "color-picker".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`color-picker`]
      
      inline def columns: typings.wordpressComponents.wordpressComponentsStrings.columns = "columns".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.columns]
      
      inline def `controls-back`: typings.wordpressComponents.wordpressComponentsStrings.`controls-back` = "controls-back".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-back`]
      
      inline def `controls-forward`: typings.wordpressComponents.wordpressComponentsStrings.`controls-forward` = "controls-forward".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-forward`]
      
      inline def `controls-pause`: typings.wordpressComponents.wordpressComponentsStrings.`controls-pause` = "controls-pause".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-pause`]
      
      inline def `controls-play`: typings.wordpressComponents.wordpressComponentsStrings.`controls-play` = "controls-play".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-play`]
      
      inline def `controls-repeat`: typings.wordpressComponents.wordpressComponentsStrings.`controls-repeat` = "controls-repeat".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-repeat`]
      
      inline def `controls-skipback`: typings.wordpressComponents.wordpressComponentsStrings.`controls-skipback` = "controls-skipback".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-skipback`]
      
      inline def `controls-skipforward`: typings.wordpressComponents.wordpressComponentsStrings.`controls-skipforward` = "controls-skipforward".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-skipforward`]
      
      inline def `controls-volumeoff`: typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeoff` = "controls-volumeoff".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeoff`]
      
      inline def `controls-volumeon`: typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeon` = "controls-volumeon".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeon`]
      
      inline def `cover-image`: typings.wordpressComponents.wordpressComponentsStrings.`cover-image` = "cover-image".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`cover-image`]
      
      inline def dashboard: typings.wordpressComponents.wordpressComponentsStrings.dashboard = "dashboard".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.dashboard]
      
      inline def database: typings.wordpressComponents.wordpressComponentsStrings.database = "database".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.database]
      
      inline def `database-add`: typings.wordpressComponents.wordpressComponentsStrings.`database-add` = "database-add".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`database-add`]
      
      inline def `database-export`: typings.wordpressComponents.wordpressComponentsStrings.`database-export` = "database-export".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`database-export`]
      
      inline def `database-import`: typings.wordpressComponents.wordpressComponentsStrings.`database-import` = "database-import".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`database-import`]
      
      inline def `database-remove`: typings.wordpressComponents.wordpressComponentsStrings.`database-remove` = "database-remove".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`database-remove`]
      
      inline def `database-view`: typings.wordpressComponents.wordpressComponentsStrings.`database-view` = "database-view".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`database-view`]
      
      inline def desktop: typings.wordpressComponents.wordpressComponentsStrings.desktop = "desktop".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.desktop]
      
      inline def dismiss: typings.wordpressComponents.wordpressComponentsStrings.dismiss = "dismiss".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.dismiss]
      
      inline def download: typings.wordpressComponents.wordpressComponentsStrings.download = "download".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.download]
      
      inline def drumstick: typings.wordpressComponents.wordpressComponentsStrings.drumstick = "drumstick".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.drumstick]
      
      inline def edit: typings.wordpressComponents.wordpressComponentsStrings.edit = "edit".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.edit]
      
      inline def `edit-large`: typings.wordpressComponents.wordpressComponentsStrings.`edit-large` = "edit-large".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`edit-large`]
      
      inline def `edit-page`: typings.wordpressComponents.wordpressComponentsStrings.`edit-page` = "edit-page".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`edit-page`]
      
      inline def `editor-aligncenter`: typings.wordpressComponents.wordpressComponentsStrings.`editor-aligncenter` = "editor-aligncenter".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-aligncenter`]
      
      inline def `editor-alignleft`: typings.wordpressComponents.wordpressComponentsStrings.`editor-alignleft` = "editor-alignleft".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-alignleft`]
      
      inline def `editor-alignright`: typings.wordpressComponents.wordpressComponentsStrings.`editor-alignright` = "editor-alignright".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-alignright`]
      
      inline def `editor-bold`: typings.wordpressComponents.wordpressComponentsStrings.`editor-bold` = "editor-bold".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-bold`]
      
      inline def `editor-break`: typings.wordpressComponents.wordpressComponentsStrings.`editor-break` = "editor-break".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-break`]
      
      inline def `editor-code`: typings.wordpressComponents.wordpressComponentsStrings.`editor-code` = "editor-code".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-code`]
      
      inline def `editor-contract`: typings.wordpressComponents.wordpressComponentsStrings.`editor-contract` = "editor-contract".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-contract`]
      
      inline def `editor-customchar`: typings.wordpressComponents.wordpressComponentsStrings.`editor-customchar` = "editor-customchar".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-customchar`]
      
      inline def `editor-expand`: typings.wordpressComponents.wordpressComponentsStrings.`editor-expand` = "editor-expand".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-expand`]
      
      inline def `editor-help`: typings.wordpressComponents.wordpressComponentsStrings.`editor-help` = "editor-help".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-help`]
      
      inline def `editor-indent`: typings.wordpressComponents.wordpressComponentsStrings.`editor-indent` = "editor-indent".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-indent`]
      
      inline def `editor-insertmore`: typings.wordpressComponents.wordpressComponentsStrings.`editor-insertmore` = "editor-insertmore".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-insertmore`]
      
      inline def `editor-italic`: typings.wordpressComponents.wordpressComponentsStrings.`editor-italic` = "editor-italic".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-italic`]
      
      inline def `editor-justify`: typings.wordpressComponents.wordpressComponentsStrings.`editor-justify` = "editor-justify".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-justify`]
      
      inline def `editor-kitchensink`: typings.wordpressComponents.wordpressComponentsStrings.`editor-kitchensink` = "editor-kitchensink".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-kitchensink`]
      
      inline def `editor-ltr`: typings.wordpressComponents.wordpressComponentsStrings.`editor-ltr` = "editor-ltr".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-ltr`]
      
      inline def `editor-ol`: typings.wordpressComponents.wordpressComponentsStrings.`editor-ol` = "editor-ol".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-ol`]
      
      inline def `editor-ol-rtl`: typings.wordpressComponents.wordpressComponentsStrings.`editor-ol-rtl` = "editor-ol-rtl".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-ol-rtl`]
      
      inline def `editor-outdent`: typings.wordpressComponents.wordpressComponentsStrings.`editor-outdent` = "editor-outdent".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-outdent`]
      
      inline def `editor-paragraph`: typings.wordpressComponents.wordpressComponentsStrings.`editor-paragraph` = "editor-paragraph".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-paragraph`]
      
      inline def `editor-paste-text`: typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-text` = "editor-paste-text".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-text`]
      
      inline def `editor-paste-word`: typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-word` = "editor-paste-word".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-word`]
      
      inline def `editor-quote`: typings.wordpressComponents.wordpressComponentsStrings.`editor-quote` = "editor-quote".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-quote`]
      
      inline def `editor-removeformatting`: typings.wordpressComponents.wordpressComponentsStrings.`editor-removeformatting` = "editor-removeformatting".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-removeformatting`]
      
      inline def `editor-rtl`: typings.wordpressComponents.wordpressComponentsStrings.`editor-rtl` = "editor-rtl".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-rtl`]
      
      inline def `editor-spellcheck`: typings.wordpressComponents.wordpressComponentsStrings.`editor-spellcheck` = "editor-spellcheck".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-spellcheck`]
      
      inline def `editor-strikethrough`: typings.wordpressComponents.wordpressComponentsStrings.`editor-strikethrough` = "editor-strikethrough".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-strikethrough`]
      
      inline def `editor-table`: typings.wordpressComponents.wordpressComponentsStrings.`editor-table` = "editor-table".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-table`]
      
      inline def `editor-textcolor`: typings.wordpressComponents.wordpressComponentsStrings.`editor-textcolor` = "editor-textcolor".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-textcolor`]
      
      inline def `editor-ul`: typings.wordpressComponents.wordpressComponentsStrings.`editor-ul` = "editor-ul".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-ul`]
      
      inline def `editor-underline`: typings.wordpressComponents.wordpressComponentsStrings.`editor-underline` = "editor-underline".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-underline`]
      
      inline def `editor-unlink`: typings.wordpressComponents.wordpressComponentsStrings.`editor-unlink` = "editor-unlink".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-unlink`]
      
      inline def `editor-video`: typings.wordpressComponents.wordpressComponentsStrings.`editor-video` = "editor-video".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-video`]
      
      inline def ellipsis: typings.wordpressComponents.wordpressComponentsStrings.ellipsis = "ellipsis".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.ellipsis]
      
      inline def email: typings.wordpressComponents.wordpressComponentsStrings.email = "email".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.email]
      
      inline def `email-alt`: typings.wordpressComponents.wordpressComponentsStrings.`email-alt` = "email-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`email-alt`]
      
      inline def `email-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`email-alt2` = "email-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`email-alt2`]
      
      inline def `embed-audio`: typings.wordpressComponents.wordpressComponentsStrings.`embed-audio` = "embed-audio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`embed-audio`]
      
      inline def `embed-generic`: typings.wordpressComponents.wordpressComponentsStrings.`embed-generic` = "embed-generic".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`embed-generic`]
      
      inline def `embed-photo`: typings.wordpressComponents.wordpressComponentsStrings.`embed-photo` = "embed-photo".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`embed-photo`]
      
      inline def `embed-post`: typings.wordpressComponents.wordpressComponentsStrings.`embed-post` = "embed-post".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`embed-post`]
      
      inline def `embed-video`: typings.wordpressComponents.wordpressComponentsStrings.`embed-video` = "embed-video".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`embed-video`]
      
      inline def `excerpt-view`: typings.wordpressComponents.wordpressComponentsStrings.`excerpt-view` = "excerpt-view".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`excerpt-view`]
      
      inline def exit: typings.wordpressComponents.wordpressComponentsStrings.exit = "exit".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.exit]
      
      inline def external: typings.wordpressComponents.wordpressComponentsStrings.external = "external".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.external]
      
      inline def facebook: typings.wordpressComponents.wordpressComponentsStrings.facebook = "facebook".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.facebook]
      
      inline def `facebook-alt`: typings.wordpressComponents.wordpressComponentsStrings.`facebook-alt` = "facebook-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`facebook-alt`]
      
      inline def feedback: typings.wordpressComponents.wordpressComponentsStrings.feedback = "feedback".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.feedback]
      
      inline def filter: typings.wordpressComponents.wordpressComponentsStrings.filter = "filter".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.filter]
      
      inline def flag: typings.wordpressComponents.wordpressComponentsStrings.flag = "flag".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.flag]
      
      inline def food: typings.wordpressComponents.wordpressComponentsStrings.food = "food".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.food]
      
      inline def `format-aside`: typings.wordpressComponents.wordpressComponentsStrings.`format-aside` = "format-aside".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-aside`]
      
      inline def `format-audio`: typings.wordpressComponents.wordpressComponentsStrings.`format-audio` = "format-audio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-audio`]
      
      inline def `format-chat`: typings.wordpressComponents.wordpressComponentsStrings.`format-chat` = "format-chat".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-chat`]
      
      inline def `format-gallery`: typings.wordpressComponents.wordpressComponentsStrings.`format-gallery` = "format-gallery".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-gallery`]
      
      inline def `format-image`: typings.wordpressComponents.wordpressComponentsStrings.`format-image` = "format-image".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-image`]
      
      inline def `format-quote`: typings.wordpressComponents.wordpressComponentsStrings.`format-quote` = "format-quote".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-quote`]
      
      inline def `format-status`: typings.wordpressComponents.wordpressComponentsStrings.`format-status` = "format-status".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-status`]
      
      inline def `format-video`: typings.wordpressComponents.wordpressComponentsStrings.`format-video` = "format-video".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-video`]
      
      inline def forms: typings.wordpressComponents.wordpressComponentsStrings.forms = "forms".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.forms]
      
      inline def `fullscreen-alt`: typings.wordpressComponents.wordpressComponentsStrings.`fullscreen-alt` = "fullscreen-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`fullscreen-alt`]
      
      inline def `fullscreen-exit-alt`: typings.wordpressComponents.wordpressComponentsStrings.`fullscreen-exit-alt` = "fullscreen-exit-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`fullscreen-exit-alt`]
      
      inline def games: typings.wordpressComponents.wordpressComponentsStrings.games = "games".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.games]
      
      inline def google: typings.wordpressComponents.wordpressComponentsStrings.google = "google".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.google]
      
      inline def `grid-view`: typings.wordpressComponents.wordpressComponentsStrings.`grid-view` = "grid-view".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`grid-view`]
      
      inline def groups: typings.wordpressComponents.wordpressComponentsStrings.groups = "groups".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.groups]
      
      inline def hammer: typings.wordpressComponents.wordpressComponentsStrings.hammer = "hammer".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.hammer]
      
      inline def heading: typings.wordpressComponents.wordpressComponentsStrings.heading = "heading".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.heading]
      
      inline def heart: typings.wordpressComponents.wordpressComponentsStrings.heart = "heart".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.heart]
      
      inline def hidden: typings.wordpressComponents.wordpressComponentsStrings.hidden = "hidden".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.hidden]
      
      inline def hourglass: typings.wordpressComponents.wordpressComponentsStrings.hourglass = "hourglass".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.hourglass]
      
      inline def html: typings.wordpressComponents.wordpressComponentsStrings.html = "html".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.html]
      
      inline def id: typings.wordpressComponents.wordpressComponentsStrings.id = "id".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.id]
      
      inline def `id-alt`: typings.wordpressComponents.wordpressComponentsStrings.`id-alt` = "id-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`id-alt`]
      
      inline def `image-crop`: typings.wordpressComponents.wordpressComponentsStrings.`image-crop` = "image-crop".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-crop`]
      
      inline def `image-filter`: typings.wordpressComponents.wordpressComponentsStrings.`image-filter` = "image-filter".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-filter`]
      
      inline def `image-flip-horizontal`: typings.wordpressComponents.wordpressComponentsStrings.`image-flip-horizontal` = "image-flip-horizontal".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-flip-horizontal`]
      
      inline def `image-flip-vertical`: typings.wordpressComponents.wordpressComponentsStrings.`image-flip-vertical` = "image-flip-vertical".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-flip-vertical`]
      
      inline def `image-rotate`: typings.wordpressComponents.wordpressComponentsStrings.`image-rotate` = "image-rotate".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-rotate`]
      
      inline def `image-rotate-left`: typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-left` = "image-rotate-left".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-left`]
      
      inline def `image-rotate-right`: typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-right` = "image-rotate-right".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-right`]
      
      inline def `images-alt`: typings.wordpressComponents.wordpressComponentsStrings.`images-alt` = "images-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`images-alt`]
      
      inline def `images-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`images-alt2` = "images-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`images-alt2`]
      
      inline def `index-card`: typings.wordpressComponents.wordpressComponentsStrings.`index-card` = "index-card".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`index-card`]
      
      inline def info: typings.wordpressComponents.wordpressComponentsStrings.info = "info".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.info]
      
      inline def `info-outline`: typings.wordpressComponents.wordpressComponentsStrings.`info-outline` = "info-outline".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`info-outline`]
      
      inline def insert: typings.wordpressComponents.wordpressComponentsStrings.insert = "insert".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.insert]
      
      inline def `insert-after`: typings.wordpressComponents.wordpressComponentsStrings.`insert-after` = "insert-after".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`insert-after`]
      
      inline def `insert-before`: typings.wordpressComponents.wordpressComponentsStrings.`insert-before` = "insert-before".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`insert-before`]
      
      inline def instagram: typings.wordpressComponents.wordpressComponentsStrings.instagram = "instagram".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.instagram]
      
      inline def laptop: typings.wordpressComponents.wordpressComponentsStrings.laptop = "laptop".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.laptop]
      
      inline def layout: typings.wordpressComponents.wordpressComponentsStrings.layout = "layout".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.layout]
      
      inline def leftright: typings.wordpressComponents.wordpressComponentsStrings.leftright = "leftright".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.leftright]
      
      inline def lightbulb: typings.wordpressComponents.wordpressComponentsStrings.lightbulb = "lightbulb".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.lightbulb]
      
      inline def linkedin: typings.wordpressComponents.wordpressComponentsStrings.linkedin = "linkedin".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.linkedin]
      
      inline def `list-view`: typings.wordpressComponents.wordpressComponentsStrings.`list-view` = "list-view".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`list-view`]
      
      inline def location: typings.wordpressComponents.wordpressComponentsStrings.location = "location".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.location]
      
      inline def `location-alt`: typings.wordpressComponents.wordpressComponentsStrings.`location-alt` = "location-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`location-alt`]
      
      inline def lock: typings.wordpressComponents.wordpressComponentsStrings.lock = "lock".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.lock]
      
      inline def marker: typings.wordpressComponents.wordpressComponentsStrings.marker = "marker".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.marker]
      
      inline def `media-archive`: typings.wordpressComponents.wordpressComponentsStrings.`media-archive` = "media-archive".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-archive`]
      
      inline def `media-audio`: typings.wordpressComponents.wordpressComponentsStrings.`media-audio` = "media-audio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-audio`]
      
      inline def `media-code`: typings.wordpressComponents.wordpressComponentsStrings.`media-code` = "media-code".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-code`]
      
      inline def `media-default`: typings.wordpressComponents.wordpressComponentsStrings.`media-default` = "media-default".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-default`]
      
      inline def `media-document`: typings.wordpressComponents.wordpressComponentsStrings.`media-document` = "media-document".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-document`]
      
      inline def `media-interactive`: typings.wordpressComponents.wordpressComponentsStrings.`media-interactive` = "media-interactive".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-interactive`]
      
      inline def `media-spreadsheet`: typings.wordpressComponents.wordpressComponentsStrings.`media-spreadsheet` = "media-spreadsheet".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-spreadsheet`]
      
      inline def `media-text`: typings.wordpressComponents.wordpressComponentsStrings.`media-text` = "media-text".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-text`]
      
      inline def `media-video`: typings.wordpressComponents.wordpressComponentsStrings.`media-video` = "media-video".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-video`]
      
      inline def megaphone: typings.wordpressComponents.wordpressComponentsStrings.megaphone = "megaphone".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.megaphone]
      
      inline def menu: typings.wordpressComponents.wordpressComponentsStrings.menu = "menu".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.menu]
      
      inline def `menu-alt`: typings.wordpressComponents.wordpressComponentsStrings.`menu-alt` = "menu-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`menu-alt`]
      
      inline def `menu-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`menu-alt2` = "menu-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`menu-alt2`]
      
      inline def `menu-alt3`: typings.wordpressComponents.wordpressComponentsStrings.`menu-alt3` = "menu-alt3".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`menu-alt3`]
      
      inline def microphone: typings.wordpressComponents.wordpressComponentsStrings.microphone = "microphone".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.microphone]
      
      inline def migrate: typings.wordpressComponents.wordpressComponentsStrings.migrate = "migrate".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.migrate]
      
      inline def minus: typings.wordpressComponents.wordpressComponentsStrings.minus = "minus".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.minus]
      
      inline def money: typings.wordpressComponents.wordpressComponentsStrings.money = "money".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.money]
      
      inline def `money-alt`: typings.wordpressComponents.wordpressComponentsStrings.`money-alt` = "money-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`money-alt`]
      
      inline def move: typings.wordpressComponents.wordpressComponentsStrings.move = "move".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.move]
      
      inline def nametag: typings.wordpressComponents.wordpressComponentsStrings.nametag = "nametag".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.nametag]
      
      inline def networking: typings.wordpressComponents.wordpressComponentsStrings.networking = "networking".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.networking]
      
      inline def no: typings.wordpressComponents.wordpressComponentsStrings.no = "no".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.no]
      
      inline def `no-alt`: typings.wordpressComponents.wordpressComponentsStrings.`no-alt` = "no-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`no-alt`]
      
      inline def `open-folder`: typings.wordpressComponents.wordpressComponentsStrings.`open-folder` = "open-folder".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`open-folder`]
      
      inline def palmtree: typings.wordpressComponents.wordpressComponentsStrings.palmtree = "palmtree".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.palmtree]
      
      inline def paperclip: typings.wordpressComponents.wordpressComponentsStrings.paperclip = "paperclip".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.paperclip]
      
      inline def pdf: typings.wordpressComponents.wordpressComponentsStrings.pdf = "pdf".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.pdf]
      
      inline def performance: typings.wordpressComponents.wordpressComponentsStrings.performance = "performance".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.performance]
      
      inline def pets: typings.wordpressComponents.wordpressComponentsStrings.pets = "pets".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.pets]
      
      inline def phone: typings.wordpressComponents.wordpressComponentsStrings.phone = "phone".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.phone]
      
      inline def pinterest: typings.wordpressComponents.wordpressComponentsStrings.pinterest = "pinterest".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.pinterest]
      
      inline def `playlist-audio`: typings.wordpressComponents.wordpressComponentsStrings.`playlist-audio` = "playlist-audio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`playlist-audio`]
      
      inline def `playlist-video`: typings.wordpressComponents.wordpressComponentsStrings.`playlist-video` = "playlist-video".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`playlist-video`]
      
      inline def `plugins-checked`: typings.wordpressComponents.wordpressComponentsStrings.`plugins-checked` = "plugins-checked".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`plugins-checked`]
      
      inline def plus: typings.wordpressComponents.wordpressComponentsStrings.plus = "plus".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.plus]
      
      inline def `plus-alt`: typings.wordpressComponents.wordpressComponentsStrings.`plus-alt` = "plus-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`plus-alt`]
      
      inline def `plus-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`plus-alt2` = "plus-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`plus-alt2`]
      
      inline def podio: typings.wordpressComponents.wordpressComponentsStrings.podio = "podio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.podio]
      
      inline def portfolio: typings.wordpressComponents.wordpressComponentsStrings.portfolio = "portfolio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.portfolio]
      
      inline def `post-status`: typings.wordpressComponents.wordpressComponentsStrings.`post-status` = "post-status".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`post-status`]
      
      inline def pressthis: typings.wordpressComponents.wordpressComponentsStrings.pressthis = "pressthis".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.pressthis]
      
      inline def printer: typings.wordpressComponents.wordpressComponentsStrings.printer = "printer".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.printer]
      
      inline def privacy: typings.wordpressComponents.wordpressComponentsStrings.privacy = "privacy".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.privacy]
      
      inline def products: typings.wordpressComponents.wordpressComponentsStrings.products = "products".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.products]
      
      inline def randomize: typings.wordpressComponents.wordpressComponentsStrings.randomize = "randomize".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.randomize]
      
      inline def reddit: typings.wordpressComponents.wordpressComponentsStrings.reddit = "reddit".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.reddit]
      
      inline def redo: typings.wordpressComponents.wordpressComponentsStrings.redo = "redo".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.redo]
      
      inline def remove: typings.wordpressComponents.wordpressComponentsStrings.remove = "remove".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.remove]
      
      inline def `rest-api`: typings.wordpressComponents.wordpressComponentsStrings.`rest-api` = "rest-api".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`rest-api`]
      
      inline def rss: typings.wordpressComponents.wordpressComponentsStrings.rss = "rss".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.rss]
      
      inline def saved: typings.wordpressComponents.wordpressComponentsStrings.saved = "saved".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.saved]
      
      inline def schedule: typings.wordpressComponents.wordpressComponentsStrings.schedule = "schedule".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.schedule]
      
      inline def screenoptions: typings.wordpressComponents.wordpressComponentsStrings.screenoptions = "screenoptions".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.screenoptions]
      
      inline def search: typings.wordpressComponents.wordpressComponentsStrings.search = "search".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.search]
      
      inline def share: typings.wordpressComponents.wordpressComponentsStrings.share = "share".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.share]
      
      inline def `share-alt`: typings.wordpressComponents.wordpressComponentsStrings.`share-alt` = "share-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`share-alt`]
      
      inline def `share-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`share-alt2` = "share-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`share-alt2`]
      
      inline def shield: typings.wordpressComponents.wordpressComponentsStrings.shield = "shield".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.shield]
      
      inline def `shield-alt`: typings.wordpressComponents.wordpressComponentsStrings.`shield-alt` = "shield-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`shield-alt`]
      
      inline def shortcode: typings.wordpressComponents.wordpressComponentsStrings.shortcode = "shortcode".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.shortcode]
      
      inline def slides: typings.wordpressComponents.wordpressComponentsStrings.slides = "slides".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.slides]
      
      inline def smartphone: typings.wordpressComponents.wordpressComponentsStrings.smartphone = "smartphone".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.smartphone]
      
      inline def smiley: typings.wordpressComponents.wordpressComponentsStrings.smiley = "smiley".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.smiley]
      
      inline def sort: typings.wordpressComponents.wordpressComponentsStrings.sort = "sort".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.sort]
      
      inline def sos: typings.wordpressComponents.wordpressComponentsStrings.sos = "sos".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.sos]
      
      inline def spotify: typings.wordpressComponents.wordpressComponentsStrings.spotify = "spotify".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.spotify]
      
      inline def `star-empty`: typings.wordpressComponents.wordpressComponentsStrings.`star-empty` = "star-empty".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`star-empty`]
      
      inline def `star-filled`: typings.wordpressComponents.wordpressComponentsStrings.`star-filled` = "star-filled".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`star-filled`]
      
      inline def `star-half`: typings.wordpressComponents.wordpressComponentsStrings.`star-half` = "star-half".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`star-half`]
      
      inline def sticky: typings.wordpressComponents.wordpressComponentsStrings.sticky = "sticky".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.sticky]
      
      inline def store: typings.wordpressComponents.wordpressComponentsStrings.store = "store".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.store]
      
      inline def superhero: typings.wordpressComponents.wordpressComponentsStrings.superhero = "superhero".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.superhero]
      
      inline def `superhero-alt`: typings.wordpressComponents.wordpressComponentsStrings.`superhero-alt` = "superhero-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`superhero-alt`]
      
      inline def `table-col-after`: typings.wordpressComponents.wordpressComponentsStrings.`table-col-after` = "table-col-after".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-col-after`]
      
      inline def `table-col-before`: typings.wordpressComponents.wordpressComponentsStrings.`table-col-before` = "table-col-before".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-col-before`]
      
      inline def `table-col-delete`: typings.wordpressComponents.wordpressComponentsStrings.`table-col-delete` = "table-col-delete".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-col-delete`]
      
      inline def `table-row-after`: typings.wordpressComponents.wordpressComponentsStrings.`table-row-after` = "table-row-after".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-row-after`]
      
      inline def `table-row-before`: typings.wordpressComponents.wordpressComponentsStrings.`table-row-before` = "table-row-before".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-row-before`]
      
      inline def `table-row-delete`: typings.wordpressComponents.wordpressComponentsStrings.`table-row-delete` = "table-row-delete".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-row-delete`]
      
      inline def tablet: typings.wordpressComponents.wordpressComponentsStrings.tablet = "tablet".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tablet]
      
      inline def tag: typings.wordpressComponents.wordpressComponentsStrings.tag = "tag".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tag]
      
      inline def tagcloud: typings.wordpressComponents.wordpressComponentsStrings.tagcloud = "tagcloud".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tagcloud]
      
      inline def testimonial: typings.wordpressComponents.wordpressComponentsStrings.testimonial = "testimonial".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.testimonial]
      
      inline def text: typings.wordpressComponents.wordpressComponentsStrings.text = "text".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.text]
      
      inline def `text-page`: typings.wordpressComponents.wordpressComponentsStrings.`text-page` = "text-page".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`text-page`]
      
      inline def `thumbs-down`: typings.wordpressComponents.wordpressComponentsStrings.`thumbs-down` = "thumbs-down".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`thumbs-down`]
      
      inline def `thumbs-up`: typings.wordpressComponents.wordpressComponentsStrings.`thumbs-up` = "thumbs-up".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`thumbs-up`]
      
      inline def tickets: typings.wordpressComponents.wordpressComponentsStrings.tickets = "tickets".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tickets]
      
      inline def `tickets-alt`: typings.wordpressComponents.wordpressComponentsStrings.`tickets-alt` = "tickets-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`tickets-alt`]
      
      inline def tide: typings.wordpressComponents.wordpressComponentsStrings.tide = "tide".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tide]
      
      inline def translation: typings.wordpressComponents.wordpressComponentsStrings.translation = "translation".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.translation]
      
      inline def trash: typings.wordpressComponents.wordpressComponentsStrings.trash = "trash".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.trash]
      
      inline def twitch: typings.wordpressComponents.wordpressComponentsStrings.twitch = "twitch".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.twitch]
      
      inline def twitter: typings.wordpressComponents.wordpressComponentsStrings.twitter = "twitter".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.twitter]
      
      inline def `twitter-alt`: typings.wordpressComponents.wordpressComponentsStrings.`twitter-alt` = "twitter-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`twitter-alt`]
      
      inline def undo: typings.wordpressComponents.wordpressComponentsStrings.undo = "undo".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.undo]
      
      inline def `universal-access`: typings.wordpressComponents.wordpressComponentsStrings.`universal-access` = "universal-access".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`universal-access`]
      
      inline def `universal-access-alt`: typings.wordpressComponents.wordpressComponentsStrings.`universal-access-alt` = "universal-access-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`universal-access-alt`]
      
      inline def unlock: typings.wordpressComponents.wordpressComponentsStrings.unlock = "unlock".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.unlock]
      
      inline def update: typings.wordpressComponents.wordpressComponentsStrings.update = "update".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.update]
      
      inline def `update-alt`: typings.wordpressComponents.wordpressComponentsStrings.`update-alt` = "update-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`update-alt`]
      
      inline def upload: typings.wordpressComponents.wordpressComponentsStrings.upload = "upload".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.upload]
      
      inline def vault: typings.wordpressComponents.wordpressComponentsStrings.vault = "vault".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.vault]
      
      inline def `video-alt`: typings.wordpressComponents.wordpressComponentsStrings.`video-alt` = "video-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`video-alt`]
      
      inline def `video-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`video-alt2` = "video-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`video-alt2`]
      
      inline def `video-alt3`: typings.wordpressComponents.wordpressComponentsStrings.`video-alt3` = "video-alt3".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`video-alt3`]
      
      inline def visibility: typings.wordpressComponents.wordpressComponentsStrings.visibility = "visibility".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.visibility]
      
      inline def warning: typings.wordpressComponents.wordpressComponentsStrings.warning = "warning".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.warning]
      
      inline def `welcome-add-page`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-add-page` = "welcome-add-page".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-add-page`]
      
      inline def `welcome-comments`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-comments` = "welcome-comments".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-comments`]
      
      inline def `welcome-learn-more`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-learn-more` = "welcome-learn-more".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-learn-more`]
      
      inline def `welcome-view-site`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-view-site` = "welcome-view-site".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-view-site`]
      
      inline def `welcome-widgets-menus`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-widgets-menus` = "welcome-widgets-menus".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-widgets-menus`]
      
      inline def `welcome-write-blog`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-write-blog` = "welcome-write-blog".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-write-blog`]
      
      inline def whatsapp: typings.wordpressComponents.wordpressComponentsStrings.whatsapp = "whatsapp".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.whatsapp]
      
      inline def wordpress: typings.wordpressComponents.wordpressComponentsStrings.wordpress = "wordpress".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.wordpress]
      
      inline def `wordpress-alt`: typings.wordpressComponents.wordpressComponentsStrings.`wordpress-alt` = "wordpress-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`wordpress-alt`]
      
      inline def xing: typings.wordpressComponents.wordpressComponentsStrings.xing = "xing".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.xing]
      
      inline def yes: typings.wordpressComponents.wordpressComponentsStrings.yes = "yes".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.yes]
      
      inline def `yes-alt`: typings.wordpressComponents.wordpressComponentsStrings.`yes-alt` = "yes-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`yes-alt`]
      
      inline def youtube: typings.wordpressComponents.wordpressComponentsStrings.youtube = "youtube".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.youtube]
    }
    
    trait Props
      extends StObject
         with SVGProps[SVGSVGElement] {
      
      /**
        * ID of the dashicon to use.
        */
      var icon: Icon
      
      /**
        * Width of the icon (in pixels).
        * @defaultValue 20
        */
      var size: js.UndefOr[Double] = js.undefined
    }
    object Props {
      
      inline def apply(icon: Icon): Props = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
  }
}
