
# Scala.js typings for windows-release

Typings are for version 3.2.0

## Library description:
Get the name of a Windows version from the release number: `5.1.2600` → `XP`

|                    |                 |
| ------------------ | :-------------: |
| Full name          | windows-release |
| Keywords           | os, win, win32, windows, operating, system, platform, name, title, release, version |
| # releases         | 2 |
| # dependents       | 3 |
| # downloads        | 6311246 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/sindresorhus/windows-release#readme)
- [Bugs](https://github.com/sindresorhus/windows-release/issues)
- [Repository](https://github.com/sindresorhus/windows-release)
- [Npm](https://www.npmjs.com/package/windows-release)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Get the name of a Windows version from the release number: `5.1.2600` → `XP`.

@param release - By default, the current OS is used, but you can supply a custom release number, which is the output of [`os.release()`](https://nodejs.org/api/os.html#os_os_release).

Note: Most Windows Server versions cannot be detected based on the release number alone. There is runtime detection in place to work around this, but it will only be used if no argument is supplied, or the supplied argument matches `os.release()`.

@example
```
import * as os from 'os';
import windowsRelease = require('windows-release');

// On a Windows XP system

windowsRelease();
//=> 'XP'

os.release();
//=> '5.1.2600'

windowsRelease(os.release());
//=> 'XP'

windowsRelease('4.9.3000');
//=> 'ME'
```
*/

```

