organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-794c0d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-5d4aa9",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-40e129",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-6ef903",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-452830",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-48d4fc",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-8eb777")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        