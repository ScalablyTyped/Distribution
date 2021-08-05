package typings.unsplashJs

import typings.std.Response
import typings.unsplashJs.anon.AccessKey
import typings.unsplashJs.anon.Bio
import typings.unsplashJs.anon.Body
import typings.unsplashJs.anon.C
import typings.unsplashJs.anon.Links
import typings.unsplashJs.anon.OrientationOrientation
import typings.unsplashJs.mod.UnsplashApi.Auth
import typings.unsplashJs.mod.UnsplashApi.Collections
import typings.unsplashJs.mod.UnsplashApi.CurrentUser
import typings.unsplashJs.mod.UnsplashApi.Photo
import typings.unsplashJs.mod.UnsplashApi.Search
import typings.unsplashJs.mod.UnsplashApi.Stats
import typings.unsplashJs.mod.UnsplashApi.Users
import typings.unsplashJs.unsplashJsStrings.days
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unsplash-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("unsplash-js", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Unsplash {
    def this(options: AccessKey) = this()
    
    /* CompleteClass */
    var auth: Auth = js.native
    
    /* CompleteClass */
    var collections: Collections = js.native
    
    /* CompleteClass */
    var currentUser: CurrentUser = js.native
    
    /* CompleteClass */
    var photos: Photo = js.native
    
    /* CompleteClass */
    override def request(requestOptions: Body): js.Promise[Response] = js.native
    
    /* CompleteClass */
    var search: Search = js.native
    
    /* CompleteClass */
    var stats: Stats = js.native
    
    /* CompleteClass */
    var users: Users = js.native
  }
  
  inline def toJson(response: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(response.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  type CollectionIds = js.Array[Double | String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.high
    - typings.unsplashJs.unsplashJsStrings.low
  */
  trait ContentSafety extends StObject
  object ContentSafety {
    
    inline def high: typings.unsplashJs.unsplashJsStrings.high = "high".asInstanceOf[typings.unsplashJs.unsplashJsStrings.high]
    
    inline def low: typings.unsplashJs.unsplashJsStrings.low = "low".asInstanceOf[typings.unsplashJs.unsplashJsStrings.low]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.af
    - typings.unsplashJs.unsplashJsStrings.am
    - typings.unsplashJs.unsplashJsStrings.ar
    - typings.unsplashJs.unsplashJsStrings.az
    - typings.unsplashJs.unsplashJsStrings.be
    - typings.unsplashJs.unsplashJsStrings.bg
    - typings.unsplashJs.unsplashJsStrings.bn
    - typings.unsplashJs.unsplashJsStrings.bs
    - typings.unsplashJs.unsplashJsStrings.ca
    - typings.unsplashJs.unsplashJsStrings.ceb
    - typings.unsplashJs.unsplashJsStrings.co
    - typings.unsplashJs.unsplashJsStrings.cs
    - typings.unsplashJs.unsplashJsStrings.cy
    - typings.unsplashJs.unsplashJsStrings.da
    - typings.unsplashJs.unsplashJsStrings.de
    - typings.unsplashJs.unsplashJsStrings.el
    - typings.unsplashJs.unsplashJsStrings.en
    - typings.unsplashJs.unsplashJsStrings.eo
    - typings.unsplashJs.unsplashJsStrings.es
    - typings.unsplashJs.unsplashJsStrings.et
    - typings.unsplashJs.unsplashJsStrings.eu
    - typings.unsplashJs.unsplashJsStrings.fa
    - typings.unsplashJs.unsplashJsStrings.fi
    - typings.unsplashJs.unsplashJsStrings.fr
    - typings.unsplashJs.unsplashJsStrings.fy
    - typings.unsplashJs.unsplashJsStrings.ga
    - typings.unsplashJs.unsplashJsStrings.gd
    - typings.unsplashJs.unsplashJsStrings.gl
    - typings.unsplashJs.unsplashJsStrings.gu
    - typings.unsplashJs.unsplashJsStrings.ha
    - typings.unsplashJs.unsplashJsStrings.haw
    - typings.unsplashJs.unsplashJsStrings.hi
    - typings.unsplashJs.unsplashJsStrings.hmn
    - typings.unsplashJs.unsplashJsStrings.hr
    - typings.unsplashJs.unsplashJsStrings.ht
    - typings.unsplashJs.unsplashJsStrings.hu
    - typings.unsplashJs.unsplashJsStrings.hy
    - typings.unsplashJs.unsplashJsStrings.id
    - typings.unsplashJs.unsplashJsStrings.ig
    - typings.unsplashJs.unsplashJsStrings.is
    - typings.unsplashJs.unsplashJsStrings.it
    - typings.unsplashJs.unsplashJsStrings.iw
    - typings.unsplashJs.unsplashJsStrings.ja
    - typings.unsplashJs.unsplashJsStrings.jw
    - typings.unsplashJs.unsplashJsStrings.ka
    - typings.unsplashJs.unsplashJsStrings.kk
    - typings.unsplashJs.unsplashJsStrings.km
    - typings.unsplashJs.unsplashJsStrings.kn
    - typings.unsplashJs.unsplashJsStrings.ko
    - typings.unsplashJs.unsplashJsStrings.ku
    - typings.unsplashJs.unsplashJsStrings.ky
    - typings.unsplashJs.unsplashJsStrings.la
    - typings.unsplashJs.unsplashJsStrings.lb
    - typings.unsplashJs.unsplashJsStrings.lo
    - typings.unsplashJs.unsplashJsStrings.lt
    - typings.unsplashJs.unsplashJsStrings.lv
    - typings.unsplashJs.unsplashJsStrings.mg
    - typings.unsplashJs.unsplashJsStrings.mi
    - typings.unsplashJs.unsplashJsStrings.mk
    - typings.unsplashJs.unsplashJsStrings.ml
    - typings.unsplashJs.unsplashJsStrings.mn
    - typings.unsplashJs.unsplashJsStrings.mr
    - typings.unsplashJs.unsplashJsStrings.ms
    - typings.unsplashJs.unsplashJsStrings.mt
    - typings.unsplashJs.unsplashJsStrings.my
    - typings.unsplashJs.unsplashJsStrings.ne
    - typings.unsplashJs.unsplashJsStrings.nl
    - typings.unsplashJs.unsplashJsStrings.no
    - typings.unsplashJs.unsplashJsStrings.ny
    - typings.unsplashJs.unsplashJsStrings.or
    - typings.unsplashJs.unsplashJsStrings.pa
    - typings.unsplashJs.unsplashJsStrings.pl
    - typings.unsplashJs.unsplashJsStrings.ps
    - typings.unsplashJs.unsplashJsStrings.pt
    - typings.unsplashJs.unsplashJsStrings.ro
    - typings.unsplashJs.unsplashJsStrings.ru
    - typings.unsplashJs.unsplashJsStrings.rw
    - typings.unsplashJs.unsplashJsStrings.sd
    - typings.unsplashJs.unsplashJsStrings.si
    - typings.unsplashJs.unsplashJsStrings.sk
    - typings.unsplashJs.unsplashJsStrings.sl
    - typings.unsplashJs.unsplashJsStrings.sm
    - typings.unsplashJs.unsplashJsStrings.sn
    - typings.unsplashJs.unsplashJsStrings.so
    - typings.unsplashJs.unsplashJsStrings.sq
    - typings.unsplashJs.unsplashJsStrings.sr
    - typings.unsplashJs.unsplashJsStrings.st
    - typings.unsplashJs.unsplashJsStrings.su
    - typings.unsplashJs.unsplashJsStrings.sv
    - typings.unsplashJs.unsplashJsStrings.sw
    - typings.unsplashJs.unsplashJsStrings.ta
    - typings.unsplashJs.unsplashJsStrings.te
    - typings.unsplashJs.unsplashJsStrings.tg
    - typings.unsplashJs.unsplashJsStrings.th
    - typings.unsplashJs.unsplashJsStrings.tk
    - typings.unsplashJs.unsplashJsStrings.tl
    - typings.unsplashJs.unsplashJsStrings.tr
    - typings.unsplashJs.unsplashJsStrings.tt
    - typings.unsplashJs.unsplashJsStrings.ug
    - typings.unsplashJs.unsplashJsStrings.uk
    - typings.unsplashJs.unsplashJsStrings.ur
    - typings.unsplashJs.unsplashJsStrings.uz
    - typings.unsplashJs.unsplashJsStrings.vi
    - typings.unsplashJs.unsplashJsStrings.xh
    - typings.unsplashJs.unsplashJsStrings.yi
    - typings.unsplashJs.unsplashJsStrings.yo
    - typings.unsplashJs.unsplashJsStrings.zh
    - typings.unsplashJs.unsplashJsStrings.`zh-TW`
    - typings.unsplashJs.unsplashJsStrings.zu
  */
  trait Languages extends StObject
  object Languages {
    
    inline def af: typings.unsplashJs.unsplashJsStrings.af = "af".asInstanceOf[typings.unsplashJs.unsplashJsStrings.af]
    
    inline def am: typings.unsplashJs.unsplashJsStrings.am = "am".asInstanceOf[typings.unsplashJs.unsplashJsStrings.am]
    
    inline def ar: typings.unsplashJs.unsplashJsStrings.ar = "ar".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ar]
    
    inline def az: typings.unsplashJs.unsplashJsStrings.az = "az".asInstanceOf[typings.unsplashJs.unsplashJsStrings.az]
    
    inline def be: typings.unsplashJs.unsplashJsStrings.be = "be".asInstanceOf[typings.unsplashJs.unsplashJsStrings.be]
    
    inline def bg: typings.unsplashJs.unsplashJsStrings.bg = "bg".asInstanceOf[typings.unsplashJs.unsplashJsStrings.bg]
    
    inline def bn: typings.unsplashJs.unsplashJsStrings.bn = "bn".asInstanceOf[typings.unsplashJs.unsplashJsStrings.bn]
    
    inline def bs: typings.unsplashJs.unsplashJsStrings.bs = "bs".asInstanceOf[typings.unsplashJs.unsplashJsStrings.bs]
    
    inline def ca: typings.unsplashJs.unsplashJsStrings.ca = "ca".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ca]
    
    inline def ceb: typings.unsplashJs.unsplashJsStrings.ceb = "ceb".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ceb]
    
    inline def co: typings.unsplashJs.unsplashJsStrings.co = "co".asInstanceOf[typings.unsplashJs.unsplashJsStrings.co]
    
    inline def cs: typings.unsplashJs.unsplashJsStrings.cs = "cs".asInstanceOf[typings.unsplashJs.unsplashJsStrings.cs]
    
    inline def cy: typings.unsplashJs.unsplashJsStrings.cy = "cy".asInstanceOf[typings.unsplashJs.unsplashJsStrings.cy]
    
    inline def da: typings.unsplashJs.unsplashJsStrings.da = "da".asInstanceOf[typings.unsplashJs.unsplashJsStrings.da]
    
    inline def de: typings.unsplashJs.unsplashJsStrings.de = "de".asInstanceOf[typings.unsplashJs.unsplashJsStrings.de]
    
    inline def el: typings.unsplashJs.unsplashJsStrings.el = "el".asInstanceOf[typings.unsplashJs.unsplashJsStrings.el]
    
    inline def en: typings.unsplashJs.unsplashJsStrings.en = "en".asInstanceOf[typings.unsplashJs.unsplashJsStrings.en]
    
    inline def eo: typings.unsplashJs.unsplashJsStrings.eo = "eo".asInstanceOf[typings.unsplashJs.unsplashJsStrings.eo]
    
    inline def es: typings.unsplashJs.unsplashJsStrings.es = "es".asInstanceOf[typings.unsplashJs.unsplashJsStrings.es]
    
    inline def et: typings.unsplashJs.unsplashJsStrings.et = "et".asInstanceOf[typings.unsplashJs.unsplashJsStrings.et]
    
    inline def eu: typings.unsplashJs.unsplashJsStrings.eu = "eu".asInstanceOf[typings.unsplashJs.unsplashJsStrings.eu]
    
    inline def fa: typings.unsplashJs.unsplashJsStrings.fa = "fa".asInstanceOf[typings.unsplashJs.unsplashJsStrings.fa]
    
    inline def fi: typings.unsplashJs.unsplashJsStrings.fi = "fi".asInstanceOf[typings.unsplashJs.unsplashJsStrings.fi]
    
    inline def fr: typings.unsplashJs.unsplashJsStrings.fr = "fr".asInstanceOf[typings.unsplashJs.unsplashJsStrings.fr]
    
    inline def fy: typings.unsplashJs.unsplashJsStrings.fy = "fy".asInstanceOf[typings.unsplashJs.unsplashJsStrings.fy]
    
    inline def ga: typings.unsplashJs.unsplashJsStrings.ga = "ga".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ga]
    
    inline def gd: typings.unsplashJs.unsplashJsStrings.gd = "gd".asInstanceOf[typings.unsplashJs.unsplashJsStrings.gd]
    
    inline def gl: typings.unsplashJs.unsplashJsStrings.gl = "gl".asInstanceOf[typings.unsplashJs.unsplashJsStrings.gl]
    
    inline def gu: typings.unsplashJs.unsplashJsStrings.gu = "gu".asInstanceOf[typings.unsplashJs.unsplashJsStrings.gu]
    
    inline def ha: typings.unsplashJs.unsplashJsStrings.ha = "ha".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ha]
    
    inline def haw: typings.unsplashJs.unsplashJsStrings.haw = "haw".asInstanceOf[typings.unsplashJs.unsplashJsStrings.haw]
    
    inline def hi: typings.unsplashJs.unsplashJsStrings.hi = "hi".asInstanceOf[typings.unsplashJs.unsplashJsStrings.hi]
    
    inline def hmn: typings.unsplashJs.unsplashJsStrings.hmn = "hmn".asInstanceOf[typings.unsplashJs.unsplashJsStrings.hmn]
    
    inline def hr: typings.unsplashJs.unsplashJsStrings.hr = "hr".asInstanceOf[typings.unsplashJs.unsplashJsStrings.hr]
    
    inline def ht: typings.unsplashJs.unsplashJsStrings.ht = "ht".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ht]
    
    inline def hu: typings.unsplashJs.unsplashJsStrings.hu = "hu".asInstanceOf[typings.unsplashJs.unsplashJsStrings.hu]
    
    inline def hy: typings.unsplashJs.unsplashJsStrings.hy = "hy".asInstanceOf[typings.unsplashJs.unsplashJsStrings.hy]
    
    inline def id: typings.unsplashJs.unsplashJsStrings.id = "id".asInstanceOf[typings.unsplashJs.unsplashJsStrings.id]
    
    inline def ig: typings.unsplashJs.unsplashJsStrings.ig = "ig".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ig]
    
    inline def is: typings.unsplashJs.unsplashJsStrings.is = "is".asInstanceOf[typings.unsplashJs.unsplashJsStrings.is]
    
    inline def it: typings.unsplashJs.unsplashJsStrings.it = "it".asInstanceOf[typings.unsplashJs.unsplashJsStrings.it]
    
    inline def iw: typings.unsplashJs.unsplashJsStrings.iw = "iw".asInstanceOf[typings.unsplashJs.unsplashJsStrings.iw]
    
    inline def ja: typings.unsplashJs.unsplashJsStrings.ja = "ja".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ja]
    
    inline def jw: typings.unsplashJs.unsplashJsStrings.jw = "jw".asInstanceOf[typings.unsplashJs.unsplashJsStrings.jw]
    
    inline def ka: typings.unsplashJs.unsplashJsStrings.ka = "ka".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ka]
    
    inline def kk: typings.unsplashJs.unsplashJsStrings.kk = "kk".asInstanceOf[typings.unsplashJs.unsplashJsStrings.kk]
    
    inline def km: typings.unsplashJs.unsplashJsStrings.km = "km".asInstanceOf[typings.unsplashJs.unsplashJsStrings.km]
    
    inline def kn: typings.unsplashJs.unsplashJsStrings.kn = "kn".asInstanceOf[typings.unsplashJs.unsplashJsStrings.kn]
    
    inline def ko: typings.unsplashJs.unsplashJsStrings.ko = "ko".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ko]
    
    inline def ku: typings.unsplashJs.unsplashJsStrings.ku = "ku".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ku]
    
    inline def ky: typings.unsplashJs.unsplashJsStrings.ky = "ky".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ky]
    
    inline def la: typings.unsplashJs.unsplashJsStrings.la = "la".asInstanceOf[typings.unsplashJs.unsplashJsStrings.la]
    
    inline def lb: typings.unsplashJs.unsplashJsStrings.lb = "lb".asInstanceOf[typings.unsplashJs.unsplashJsStrings.lb]
    
    inline def lo: typings.unsplashJs.unsplashJsStrings.lo = "lo".asInstanceOf[typings.unsplashJs.unsplashJsStrings.lo]
    
    inline def lt: typings.unsplashJs.unsplashJsStrings.lt = "lt".asInstanceOf[typings.unsplashJs.unsplashJsStrings.lt]
    
    inline def lv: typings.unsplashJs.unsplashJsStrings.lv = "lv".asInstanceOf[typings.unsplashJs.unsplashJsStrings.lv]
    
    inline def mg: typings.unsplashJs.unsplashJsStrings.mg = "mg".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mg]
    
    inline def mi: typings.unsplashJs.unsplashJsStrings.mi = "mi".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mi]
    
    inline def mk: typings.unsplashJs.unsplashJsStrings.mk = "mk".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mk]
    
    inline def ml: typings.unsplashJs.unsplashJsStrings.ml = "ml".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ml]
    
    inline def mn: typings.unsplashJs.unsplashJsStrings.mn = "mn".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mn]
    
    inline def mr: typings.unsplashJs.unsplashJsStrings.mr = "mr".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mr]
    
    inline def ms: typings.unsplashJs.unsplashJsStrings.ms = "ms".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ms]
    
    inline def mt: typings.unsplashJs.unsplashJsStrings.mt = "mt".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mt]
    
    inline def my: typings.unsplashJs.unsplashJsStrings.my = "my".asInstanceOf[typings.unsplashJs.unsplashJsStrings.my]
    
    inline def ne: typings.unsplashJs.unsplashJsStrings.ne = "ne".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ne]
    
    inline def nl: typings.unsplashJs.unsplashJsStrings.nl = "nl".asInstanceOf[typings.unsplashJs.unsplashJsStrings.nl]
    
    inline def no: typings.unsplashJs.unsplashJsStrings.no = "no".asInstanceOf[typings.unsplashJs.unsplashJsStrings.no]
    
    inline def ny: typings.unsplashJs.unsplashJsStrings.ny = "ny".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ny]
    
    inline def or: typings.unsplashJs.unsplashJsStrings.or = "or".asInstanceOf[typings.unsplashJs.unsplashJsStrings.or]
    
    inline def pa: typings.unsplashJs.unsplashJsStrings.pa = "pa".asInstanceOf[typings.unsplashJs.unsplashJsStrings.pa]
    
    inline def pl: typings.unsplashJs.unsplashJsStrings.pl = "pl".asInstanceOf[typings.unsplashJs.unsplashJsStrings.pl]
    
    inline def ps: typings.unsplashJs.unsplashJsStrings.ps = "ps".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ps]
    
    inline def pt: typings.unsplashJs.unsplashJsStrings.pt = "pt".asInstanceOf[typings.unsplashJs.unsplashJsStrings.pt]
    
    inline def ro: typings.unsplashJs.unsplashJsStrings.ro = "ro".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ro]
    
    inline def ru: typings.unsplashJs.unsplashJsStrings.ru = "ru".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ru]
    
    inline def rw: typings.unsplashJs.unsplashJsStrings.rw = "rw".asInstanceOf[typings.unsplashJs.unsplashJsStrings.rw]
    
    inline def sd: typings.unsplashJs.unsplashJsStrings.sd = "sd".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sd]
    
    inline def si: typings.unsplashJs.unsplashJsStrings.si = "si".asInstanceOf[typings.unsplashJs.unsplashJsStrings.si]
    
    inline def sk: typings.unsplashJs.unsplashJsStrings.sk = "sk".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sk]
    
    inline def sl: typings.unsplashJs.unsplashJsStrings.sl = "sl".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sl]
    
    inline def sm: typings.unsplashJs.unsplashJsStrings.sm = "sm".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sm]
    
    inline def sn: typings.unsplashJs.unsplashJsStrings.sn = "sn".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sn]
    
    inline def so: typings.unsplashJs.unsplashJsStrings.so = "so".asInstanceOf[typings.unsplashJs.unsplashJsStrings.so]
    
    inline def sq: typings.unsplashJs.unsplashJsStrings.sq = "sq".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sq]
    
    inline def sr: typings.unsplashJs.unsplashJsStrings.sr = "sr".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sr]
    
    inline def st: typings.unsplashJs.unsplashJsStrings.st = "st".asInstanceOf[typings.unsplashJs.unsplashJsStrings.st]
    
    inline def su: typings.unsplashJs.unsplashJsStrings.su = "su".asInstanceOf[typings.unsplashJs.unsplashJsStrings.su]
    
    inline def sv: typings.unsplashJs.unsplashJsStrings.sv = "sv".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sv]
    
    inline def sw: typings.unsplashJs.unsplashJsStrings.sw = "sw".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sw]
    
    inline def ta: typings.unsplashJs.unsplashJsStrings.ta = "ta".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ta]
    
    inline def te: typings.unsplashJs.unsplashJsStrings.te = "te".asInstanceOf[typings.unsplashJs.unsplashJsStrings.te]
    
    inline def tg: typings.unsplashJs.unsplashJsStrings.tg = "tg".asInstanceOf[typings.unsplashJs.unsplashJsStrings.tg]
    
    inline def th: typings.unsplashJs.unsplashJsStrings.th = "th".asInstanceOf[typings.unsplashJs.unsplashJsStrings.th]
    
    inline def tk: typings.unsplashJs.unsplashJsStrings.tk = "tk".asInstanceOf[typings.unsplashJs.unsplashJsStrings.tk]
    
    inline def tl: typings.unsplashJs.unsplashJsStrings.tl = "tl".asInstanceOf[typings.unsplashJs.unsplashJsStrings.tl]
    
    inline def tr: typings.unsplashJs.unsplashJsStrings.tr = "tr".asInstanceOf[typings.unsplashJs.unsplashJsStrings.tr]
    
    inline def tt: typings.unsplashJs.unsplashJsStrings.tt = "tt".asInstanceOf[typings.unsplashJs.unsplashJsStrings.tt]
    
    inline def ug: typings.unsplashJs.unsplashJsStrings.ug = "ug".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ug]
    
    inline def uk: typings.unsplashJs.unsplashJsStrings.uk = "uk".asInstanceOf[typings.unsplashJs.unsplashJsStrings.uk]
    
    inline def ur: typings.unsplashJs.unsplashJsStrings.ur = "ur".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ur]
    
    inline def uz: typings.unsplashJs.unsplashJsStrings.uz = "uz".asInstanceOf[typings.unsplashJs.unsplashJsStrings.uz]
    
    inline def vi: typings.unsplashJs.unsplashJsStrings.vi = "vi".asInstanceOf[typings.unsplashJs.unsplashJsStrings.vi]
    
    inline def xh: typings.unsplashJs.unsplashJsStrings.xh = "xh".asInstanceOf[typings.unsplashJs.unsplashJsStrings.xh]
    
    inline def yi: typings.unsplashJs.unsplashJsStrings.yi = "yi".asInstanceOf[typings.unsplashJs.unsplashJsStrings.yi]
    
    inline def yo: typings.unsplashJs.unsplashJsStrings.yo = "yo".asInstanceOf[typings.unsplashJs.unsplashJsStrings.yo]
    
    inline def zh: typings.unsplashJs.unsplashJsStrings.zh = "zh".asInstanceOf[typings.unsplashJs.unsplashJsStrings.zh]
    
    inline def `zh-TW`: typings.unsplashJs.unsplashJsStrings.`zh-TW` = "zh-TW".asInstanceOf[typings.unsplashJs.unsplashJsStrings.`zh-TW`]
    
    inline def zu: typings.unsplashJs.unsplashJsStrings.zu = "zu".asInstanceOf[typings.unsplashJs.unsplashJsStrings.zu]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.portrait
    - typings.unsplashJs.unsplashJsStrings.landscape
    - typings.unsplashJs.unsplashJsStrings.squareish
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def landscape: typings.unsplashJs.unsplashJsStrings.landscape = "landscape".asInstanceOf[typings.unsplashJs.unsplashJsStrings.landscape]
    
    inline def portrait: typings.unsplashJs.unsplashJsStrings.portrait = "portrait".asInstanceOf[typings.unsplashJs.unsplashJsStrings.portrait]
    
    inline def squareish: typings.unsplashJs.unsplashJsStrings.squareish = "squareish".asInstanceOf[typings.unsplashJs.unsplashJsStrings.squareish]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.latest
    - typings.unsplashJs.unsplashJsStrings.oldest
  */
  trait PhotoOrderBy extends StObject
  object PhotoOrderBy {
    
    inline def latest: typings.unsplashJs.unsplashJsStrings.latest = "latest".asInstanceOf[typings.unsplashJs.unsplashJsStrings.latest]
    
    inline def oldest: typings.unsplashJs.unsplashJsStrings.oldest = "oldest".asInstanceOf[typings.unsplashJs.unsplashJsStrings.oldest]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.public
    - typings.unsplashJs.unsplashJsStrings.read_user
    - typings.unsplashJs.unsplashJsStrings.write_user
    - typings.unsplashJs.unsplashJsStrings.read_photos
    - typings.unsplashJs.unsplashJsStrings.write_photos
    - typings.unsplashJs.unsplashJsStrings.write_likes
    - typings.unsplashJs.unsplashJsStrings.write_followers
    - typings.unsplashJs.unsplashJsStrings.read_collections
    - typings.unsplashJs.unsplashJsStrings.write_collections
  */
  trait Scopes extends StObject
  object Scopes {
    
    inline def public: typings.unsplashJs.unsplashJsStrings.public = "public".asInstanceOf[typings.unsplashJs.unsplashJsStrings.public]
    
    inline def read_collections: typings.unsplashJs.unsplashJsStrings.read_collections = "read_collections".asInstanceOf[typings.unsplashJs.unsplashJsStrings.read_collections]
    
    inline def read_photos: typings.unsplashJs.unsplashJsStrings.read_photos = "read_photos".asInstanceOf[typings.unsplashJs.unsplashJsStrings.read_photos]
    
    inline def read_user: typings.unsplashJs.unsplashJsStrings.read_user = "read_user".asInstanceOf[typings.unsplashJs.unsplashJsStrings.read_user]
    
    inline def write_collections: typings.unsplashJs.unsplashJsStrings.write_collections = "write_collections".asInstanceOf[typings.unsplashJs.unsplashJsStrings.write_collections]
    
    inline def write_followers: typings.unsplashJs.unsplashJsStrings.write_followers = "write_followers".asInstanceOf[typings.unsplashJs.unsplashJsStrings.write_followers]
    
    inline def write_likes: typings.unsplashJs.unsplashJsStrings.write_likes = "write_likes".asInstanceOf[typings.unsplashJs.unsplashJsStrings.write_likes]
    
    inline def write_photos: typings.unsplashJs.unsplashJsStrings.write_photos = "write_photos".asInstanceOf[typings.unsplashJs.unsplashJsStrings.write_photos]
    
    inline def write_user: typings.unsplashJs.unsplashJsStrings.write_user = "write_user".asInstanceOf[typings.unsplashJs.unsplashJsStrings.write_user]
  }
  
  trait Unsplash extends StObject {
    
    var auth: Auth
    
    var collections: Collections
    
    var currentUser: CurrentUser
    
    var photos: Photo
    
    def request(requestOptions: Body): js.Promise[Response]
    
    var search: Search
    
    var stats: Stats
    
    var users: Users
  }
  object Unsplash {
    
    inline def apply(
      auth: Auth,
      collections: Collections,
      currentUser: CurrentUser,
      photos: Photo,
      request: Body => js.Promise[Response],
      search: Search,
      stats: Stats,
      users: Users
    ): Unsplash = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], currentUser = currentUser.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], request = js.Any.fromFunction1(request), search = search.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unsplash]
    }
    
    extension [Self <: Unsplash](x: Self) {
      
      inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setCollections(value: Collections): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      inline def setCurrentUser(value: CurrentUser): Self = StObject.set(x, "currentUser", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: Photo): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Body => js.Promise[Response]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  object UnsplashApi {
    
    @js.native
    trait Auth extends StObject {
      
      def getAuthenticationUrl(): String = js.native
      def getAuthenticationUrl(scopes: js.Array[Scopes]): String = js.native
      
      def setBearerToken(accessToken: String): Unit = js.native
      
      def userAuthentication(code: String): js.Promise[Response] = js.native
    }
    
    @js.native
    trait Collections extends StObject {
      
      def addPhotoToCollection(collectionId: Double, photoId: String): js.Promise[Response] = js.native
      
      def createCollection(title: String): js.Promise[Response] = js.native
      def createCollection(title: String, description: String): js.Promise[Response] = js.native
      def createCollection(title: String, description: String, isPrivate: Boolean): js.Promise[Response] = js.native
      def createCollection(title: String, description: Unit, isPrivate: Boolean): js.Promise[Response] = js.native
      
      def deleteCollection(id: Double): js.Promise[Response] = js.native
      
      def getCollection(id: Double): js.Promise[Response] = js.native
      
      def getCollectionPhotos(id: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double, perPage: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: Double,
        orderBy: Unit,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: Unit,
        orderBy: Unit,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double, perPage: Unit, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: Unit,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Unit, perPage: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Unit,
        perPage: Double,
        orderBy: Unit,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Unit, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Unit,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Unit, perPage: Unit, orderBy: Unit, options: typings.unsplashJs.anon.Orientation): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Unit, perPage: Unit, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Unit,
        perPage: Unit,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      
      def listCollections(): js.Promise[Response] = js.native
      def listCollections(page: Double): js.Promise[Response] = js.native
      def listCollections(page: Double, perPage: Double): js.Promise[Response] = js.native
      def listCollections(page: Unit, perPage: Double): js.Promise[Response] = js.native
      
      def listRelatedCollections(collectionId: Double): js.Promise[Response] = js.native
      
      def removePhotoFromCollection(collectionId: Double, photoId: String): js.Promise[Response] = js.native
      
      def updateCollection(id: Double): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String, description: String): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String, description: String, isPrivate: Boolean): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String, description: Unit, isPrivate: Boolean): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: Unit, description: String): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: Unit, description: String, isPrivate: Boolean): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: Unit, description: Unit, isPrivate: Boolean): js.Promise[Response] = js.native
    }
    
    trait CurrentUser extends StObject {
      
      def profile(): js.Promise[Response]
      
      def updateProfile(options: Bio): js.Promise[Response]
    }
    object CurrentUser {
      
      inline def apply(profile: () => js.Promise[Response], updateProfile: Bio => js.Promise[Response]): CurrentUser = {
        val __obj = js.Dynamic.literal(profile = js.Any.fromFunction0(profile), updateProfile = js.Any.fromFunction1(updateProfile))
        __obj.asInstanceOf[CurrentUser]
      }
      
      extension [Self <: CurrentUser](x: Self) {
        
        inline def setProfile(value: () => js.Promise[Response]): Self = StObject.set(x, "profile", js.Any.fromFunction0(value))
        
        inline def setUpdateProfile(value: Bio => js.Promise[Response]): Self = StObject.set(x, "updateProfile", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Photo extends StObject {
      
      def downloadPhoto(photo: Links): js.Promise[Response] = js.native
      
      def getPhoto(id: String): js.Promise[Response] = js.native
      
      def getPhotoStats(id: String): js.Promise[Response] = js.native
      
      def getRandomPhoto(options: C): js.Promise[Response] = js.native
      
      def likePhoto(id: String): js.Promise[Response] = js.native
      
      def listPhotos(): js.Promise[Response] = js.native
      def listPhotos(page: Double): js.Promise[Response] = js.native
      def listPhotos(page: Double, perPage: Double): js.Promise[Response] = js.native
      def listPhotos(page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def listPhotos(page: Double, perPage: Unit, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def listPhotos(page: Unit, perPage: Double): js.Promise[Response] = js.native
      def listPhotos(page: Unit, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def listPhotos(page: Unit, perPage: Unit, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      
      def trackDownload(photo: Links): js.Promise[Response] = js.native
      
      def unlikePhoto(id: String): js.Promise[Response] = js.native
    }
    
    @js.native
    trait Search extends StObject {
      
      def collections(keyword: String): js.Promise[Response] = js.native
      def collections(keyword: String, page: Double): js.Promise[Response] = js.native
      def collections(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def collections(keyword: String, page: Unit, perPage: Double): js.Promise[Response] = js.native
      
      def photos(keyword: String): js.Promise[Response] = js.native
      def photos(keyword: String, page: Double): js.Promise[Response] = js.native
      def photos(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def photos(keyword: String, page: Double, perPage: Double, filters: typings.unsplashJs.anon.Collections): js.Promise[Response] = js.native
      def photos(keyword: String, page: Double, perPage: Unit, filters: typings.unsplashJs.anon.Collections): js.Promise[Response] = js.native
      def photos(keyword: String, page: Unit, perPage: Double): js.Promise[Response] = js.native
      def photos(keyword: String, page: Unit, perPage: Double, filters: typings.unsplashJs.anon.Collections): js.Promise[Response] = js.native
      def photos(keyword: String, page: Unit, perPage: Unit, filters: typings.unsplashJs.anon.Collections): js.Promise[Response] = js.native
      
      def users(keyword: String): js.Promise[Response] = js.native
      def users(keyword: String, page: Double): js.Promise[Response] = js.native
      def users(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def users(keyword: String, page: Unit, perPage: Double): js.Promise[Response] = js.native
    }
    
    trait Stats extends StObject {
      
      def total(): js.Promise[Response]
    }
    object Stats {
      
      inline def apply(total: () => js.Promise[Response]): Stats = {
        val __obj = js.Dynamic.literal(total = js.Any.fromFunction0(total))
        __obj.asInstanceOf[Stats]
      }
      
      extension [Self <: Stats](x: Self) {
        
        inline def setTotal(value: () => js.Promise[Response]): Self = StObject.set(x, "total", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait Users extends StObject {
      
      def collections(username: String): js.Promise[Response] = js.native
      def collections(username: String, page: Double): js.Promise[Response] = js.native
      def collections(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def collections(username: String, page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
      def collections(username: String, page: Double, perPage: Unit, orderBy: String): js.Promise[Response] = js.native
      def collections(username: String, page: Unit, perPage: Double): js.Promise[Response] = js.native
      def collections(username: String, page: Unit, perPage: Double, orderBy: String): js.Promise[Response] = js.native
      def collections(username: String, page: Unit, perPage: Unit, orderBy: String): js.Promise[Response] = js.native
      
      def likes(username: String): js.Promise[Response] = js.native
      def likes(username: String, page: Double): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: Double, orderBy: Unit, options: OrientationOrientation): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: Unit, orderBy: Unit, options: OrientationOrientation): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: Unit, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Double,
        perPage: Unit,
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Unit, perPage: Double): js.Promise[Response] = js.native
      def likes(username: String, page: Unit, perPage: Double, orderBy: Unit, options: OrientationOrientation): js.Promise[Response] = js.native
      def likes(username: String, page: Unit, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Unit,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Unit, perPage: Unit, orderBy: Unit, options: OrientationOrientation): js.Promise[Response] = js.native
      def likes(username: String, page: Unit, perPage: Unit, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Unit,
        perPage: Unit,
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      
      def photos(username: String): js.Promise[Response] = js.native
      def photos(username: String, page: Double): js.Promise[Response] = js.native
      def photos(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: Unit,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: Unit,
        orderBy: Unit,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Double, perPage: Unit, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: Unit,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Unit, perPage: Double): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Unit,
        perPage: Double,
        orderBy: Unit,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Unit, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Unit,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Unit, perPage: Unit, orderBy: Unit, options: typings.unsplashJs.anon.Stats): js.Promise[Response] = js.native
      def photos(username: String, page: Unit, perPage: Unit, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Unit,
        perPage: Unit,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      
      def profile(username: String): js.Promise[Response] = js.native
      
      def statistics(username: String): js.Promise[Response] = js.native
      def statistics(username: String, resolution: Unit, quantity: Double): js.Promise[Response] = js.native
      @JSName("statistics")
      def statistics_days(username: String, resolution: days): js.Promise[Response] = js.native
      @JSName("statistics")
      def statistics_days(username: String, resolution: days, quantity: Double): js.Promise[Response] = js.native
    }
  }
}
